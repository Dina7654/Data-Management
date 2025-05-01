"""Description: Create an efficient way to manage a sports team's players information.
The information needs to include their goals, starting status and other useful details. 
These should include if a team wants to remove a player, add a player, find a player,
or if the team wants to update a players status or goals. This program should also
be able to display the team, the stats and allow them to exit. My goal for when they exit
is to save everything to another file using write. This allows the tem's managment to become
more organized and accessible and allows the team to be able to access files for later.
"""


# Function to add a new player to the team
def add_player(players, name, goals, is_starter):
    # append the players' details as a dictionary to the players list
    players.append({"name": name, "goals": goals, "Starter": is_starter})


# Function to find a player by stating their name
def find_player(players, name):
    for player in players:
        if player["name"] == name:
            print(f"Player found: {player}")
            return player
    print("Player not found.")
    return None


# Function to update an existing's player's information
def update_player(players, name):
    # Find player by name
    player = find_player(players, name)
    if player:
        # Get updated information
        goals = int(input("Enter new number of goals:"))
        is_starter = (
            input("Is the player a starter? (yes/no):").lower() == "yes"
        )
        # Update player information
        player.update({"goals": goals, "Starter": is_starter})
        print("Player updated successfully.")
    else:
        print("Player not found")


# Function to remove player by name
def remove_player(players, name):
    # Find player name
    player = find_player(players, name)
    if player:
        # remove player from player list if found
        players.remove(player)
        print("Player removed successfully.")


# Function to display team statistics
def display_stats(players):
    # Calculate total goals scored
    total_goals = sum(player["goals"] for player in players)
    # Count number of starting players
    starters = [player for player in players if player["Starter"]]
    # Display total goals and number of starters
    print(f"Total Goals: {total_goals}")
    print(f"Number of starters: {len(starters)}")


# Function to display all players or only starters
def display_team(players, only_starters=False):

    # Iterate over each player in the list
    for player in players:

        # skip players if starters are requested
        if only_starters and not player["Starter"]:
            continue
        # Print player information
        print(player)


# Function to save player information to a file
def save_to_file(players):
    with open("players_data.txt", "w") as file:
        # Write each player's information to the file
        for player in players:
            file.write(
                f"Name: {player['name']}, Goals: {player['goals']}, Starter: {player['Starter']}\n"
            )
    print("Player data saved to players_data.txt.")


# Function to display the menu of options
def menu():
    print("Menu:")
    print("1 - Add Player")
    print("2 - Find Player")
    print("3 - Update Player")
    print("4 - Remove Player")
    print("5 - Display Statistics")
    print("6 - Display Team")
    print("7 - Display Starting Team")
    print("8 - Exit")


# Main function to run the program
def main():
    # Initialize an empty list to store player information
    players = []

    # Loop until player chooses "Exit"
    while True:
        # Display menu
        menu()
        choice = input("Enter your selection:")

        if choice == "1":
            # add new player
            name = input("Enter player name: ")
            goals = int(input("Enter number of goals: "))
            is_starter = (
                input("Is the player a starter? (yes/no): ").lower() == "yes"
            )
            add_player(players, name, goals, is_starter)

        elif choice == "2":
            # find player by their name
            name = input("Enter player name to find: ")
            find_player(players, name)

        elif choice == "3":
            # update a player's information
            name = input("Enter player name to update: ")
            update_player(players, name)

        elif choice == "4":
            # remove a player
            name = input("Enter player name to remove: ")
            remove_player(players, name)

        elif choice == "5":
            # display the team's total goals and number of starters
            display_stats(players)

        elif choice == "6":
            # Display the players' information
            display_team(players)

        elif choice == "7":
            # display starting player information
            display_team(players, only_starters=True)

        elif choice == "8":
            # save information to a file and exit the program
            save_to_file(players)
            print("Exiting the program.")
            break
        else:
            # handle invalid menu selection
            print("Invalid choice. Please enter a number between 1 and 8.")


# run main function
if __name__ == "__main__":
    main()
