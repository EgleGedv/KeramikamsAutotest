Keramikams.lt Autotest

Website tested: https://keramikams.lt/

Test login email: Cocococonut144@gmail.com
Test login password: Coconut123

1.Login

Note: Tests are not included in testng.xml file. Please run testPositiveLogin separately and only by itself, otherwise it will not work because of reCaptcha.

1.1 Log in using existing account details

*Go to the main page;
*To Accept Cookies, click "Sutinku";
*Click on "Nuorodos" in the top-right corner;
*In the "Nuorodos" dropdown, click  "Prisijungti";
*Enter login details:
-test email adress;
-test password;
*Click "Prisijungti";
*Click "Nuorodos";
*Click button for more options;
*Click "Mano Paskyra"

Expected Result: In the page My Account in the box under contact information the full user name will appear.

1.2. Log in using unexisting account details

*Go to the main page;
*To Accept Cookies, click "Sutinku";
*Click on "Nuorodos" in the top-right corner;
*In the "Nuorodos" dropdown, click  "Prisijungti";
*Enter login details:
-unexisting email adress;
-unexisting password;
*Click "Prisijungti";

Expected result: The same page will remain, but above the login fields red text
"Neteisingas prisijungimo vardas arba slaptažodis." will appear.

2. Item search using a search field

2.1 Search for an existing item

*Go to the main page;
*To Accept Cookies, click "Sutinku";
*Type the name of the item "Raudona riebi molio mase"
*Click on the magnifier icon to search

Expected result: New page with items will open, looking for the item with a name "Raudona riebi molio masė" to appear.

2.2 Search for an unexisting item

*Go to the main page;
*To Accept Cookies, click "Sutinku";
*Type the name of the item "Rauuuu"
*Click on the magnifier icon to search

Expected result: New page will open, text "Pagal jūsų ieškotą frazę prekių nebuvo rasta." will appear.

3. Cart

3.1. Adding an item with specified quantity to cart

*Go the page with items from search "Raudona riebi molio mase";
*On the first item "Raudona riebi molio masė", click button "Į Krepšelį";
*Enter new quantity for 20kg - 2;
*Enter new quantity for 5kg - 2;
*Below click button "Į Krepšelį"

Expected result: Number in the Basket Icon (Top-right) will change from 0 to 4.

4. Sort items

4.1.  Sort items by price, using an arrow button (highest to lowest)

*In the page of the Item Group "Porcelianas"
*Click on the sort by dropdown menu and choose "Kaina";
*Save the values before sorting and sort them in the descending order using .reverseOrder() method;
*Click on the arrow to set a descending direction;
*Save the values after sorting;
*Compare the values;

Expected result: The compared values will be equal. The product will be sorted from highest price to the lowest (we check if the values are correctly sorted).

5. Sidebar filter

5.1. Check label appearance after setting a price filter to 1,55€ - 3,55 €

*In the main page, top menu-bar, mouse-hover onto "Prekių katalogas" to see the options;
*From the menu choose "Vokiška glazūra";
*In the sidebar under "VOKIŠKA GLAZŪRA, click "BOTZ" and wait for a new page to load;
*In the slider choose price between 1,55€ - 3,55 €;

Expected result: Under "Filtruojama pagal" section the label "KAINA" with a chosen price will appear.

5.2. The correct items are given, after setting a price filter to 1,55€ - 3,55 €

*In the main page, top menu-bar, mouse-hover onto "Prekių katalogas" to see the options;
*From the menu choose "Vokiška glazūra";
*In the sidebar under "VOKIŠKA GLAZŪRA, click "BOTZ" and wait for a new page to load;
*In the slider choose price between 1,55€ - 3,55 €;
*Save the price values of the items given, check if they are between 1,55€ - 3,55 €;

Expected result: The condition that values of all given items fall in the range between 1,55€ - 3,55 € is true. 

5.3. The incorrect items are given, after setting a price filter to 1,55€ - 4,55 €

*In the main page, top menu-bar, mouse-hover onto "Prekių katalogas" to see the options;
*From the menu choose "Vokiška glazūra";
*In the sidebar under "VOKIŠKA GLAZŪRA, click "BOTZ" and wait for a new page to load;
*In the slider choose price between 1,55€ - 4,55 €;
*Save the price values of the items given, check if they are between 1,55€ - 4,55 €;

Expected result: The condition that values of all given items fall in the range between 1,55€ - 4,55 € is false. 

5.4. Filtering out a specific item - Botz White 9876 glaze

*In the main page, top menu-bar, mouse-hover onto "Prekių katalogas" to see the options;
*From the menu choose "Vokiška glazūra";
*In the sidebar under "VOKIŠKA GLAZŪRA, click "BOTZ" and wait for a new page to load;
*In the slider choose price between 1,55€ - 4,55 €;
*From "Dengiamumas" select "Dengianti";
*From "Blizgesio lygis" select "Blizgus";
*From "Glazuros savybes" select "Rekomenduojama indams";
*From "Colour" select "Balta";

Expected result: Item "Botz White 9876" will appear as the first item. 

