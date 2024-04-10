This is badminton project created during SME 
<br>
Badminton club:
Create an application for a Badminton club - sports centre. This club has 3 badminton courts where anyone can come in, play and pay. 
There is an administrator who looks after this club. He makes note of the players details, start and end time of matches played, the amount each player has to pay. 2 players are allowed to play a match in a court at any point of time. The player who loses the match will pay the price for the time played at the cost of  Rs. 2 per minute. Players (if they lose a match) can do a part payment on that day and the balance amount will be maintained. 

This application must be developed using spring-boot, spring-data JPA, spring security, my-sql database.

1. Admin must be able to login to the application using his/her username and password. Administrator has the role "admin-role". Implement spring-security with in-memory-authentication. 
2. Admin should be able to create player_details with phone_number and name.
3. When a match starts in a court, admin should be able to create match_details with court_no, start_date_time, status (STARTED), player_1_phone_no and player_2_phone_no.
4. When the match ends (say in court_no 1), admin should be able to update current match_details of court_no 1 with end_date_time, status(ENDED), loser's phone no and amount, which must be calculated based on the number of minutes between start and end date time of the match. This amount must be added to the account_balance of loser's player_details.
5. Admin should be able to create payment_details when a player does payment. If player does part payment, remaining balance must be updated to player's account_balance.
6. Admin should be able to retrieve list of players with details
7. Admin should be able to retrieve inidividual player_details by phone_number
8. Admin should be able to retrieve match_details in a date range. 
9. Admin should be able to retrieve match_details of a player(phone_number) in a date range.
10. Admin should be able to retrieve payment details of a player

Note: The 3 badminton courts are identified by just numbers 1, 2 , 3

Database Models:

player_details:
	phone_number (primary key)
	name
	account_balance

match_details:
	id (integer auto increment)
	court_no
	match_status (enums: STARTED, ENDED)
	player_1_phone_no
	player_2_phone_no
	start_date_time
	end_date_time
	loser_phone_no
	amount

payment_details:
	player_phone_number (foriegn key)
	date_of_payment
	amount_paid
	






