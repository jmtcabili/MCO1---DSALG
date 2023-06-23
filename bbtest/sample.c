#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

#define MAX_NAME_LENGTH 50

void generate_dataset(const char* filename, int num_entries);
char* generate_random_name();
char* generate_random_word(const char** word_list, int word_count);

int main() {
    srand(time(NULL));
    generate_dataset("name_dataset.txt", 25000);
    return 0;
}

void generate_dataset(const char* filename, int num_entries) {
    FILE* file = fopen(filename, "w");
    if (file == NULL) {
        printf("Failed to open file for writing.\n");
        return;
    }

    int* id_numbers = (int*)malloc(num_entries * sizeof(int));
    for (int i = 0; i < num_entries; i++) {
        id_numbers[i] = i + 1;
    }

    // Shuffle the id numbers using Fisher-Yates algorithm
    for (int i = num_entries - 1; i > 0; i--) {
        int j = rand() % (i + 1);
        int temp = id_numbers[i];
        id_numbers[i] = id_numbers[j];
        id_numbers[j] = temp;
    }

    for (int i = 0; i < num_entries; i++) {
        char* name = generate_random_name();
        fprintf(file, "%d %s\n", id_numbers[i], name);
        free(name);
    }

    free(id_numbers);
    fclose(file);
}

char* generate_random_name() {
    const char* adjectives[] = {"Jovial", "Happy", "Brave", "Clever", "Gentle"};
    const int num_adjectives = sizeof(adjectives) / sizeof(adjectives[0]);

    const char* nouns[] = {"Shtern", "Doe", "Smith", "Johnson", "Williams"};
    const int num_nouns = sizeof(nouns) / sizeof(nouns[0]);

    char* adjective = generate_random_word(adjectives, num_adjectives);
    char* noun = generate_random_word(nouns, num_nouns);

    int name_length = strlen(adjective) + strlen(noun) + 2; // 2 for space and null terminator
    char* name = (char*)malloc(name_length * sizeof(char));
    snprintf(name, name_length, "%s %s", adjective, noun);

    free(adjective);
    free(noun);

    return name;
}

char* generate_random_word(const char** word_list, int word_count) {
    int random_index = rand() % word_count;
    return strdup(word_list[random_index]);
}