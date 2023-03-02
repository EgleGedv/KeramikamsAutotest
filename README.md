### Keramikams.lt Autotest

Website tested - [Keramikams.lt](https://keramikams.lt/)

Test login email: Cocococonut144@gmail.com

Test login password: Coconut123

### 1. Login

> ***Note: Login tests are not included in testng.xml file. Please run testPositiveLoginCoco_Coconut separately and only by itself, otherwise it will not work because of reCaptcha.***

#### 1.1 Log in using existing account details

1. Go to the main page;
2. To Accept Cookies, click "Sutinku";
3. Click on "Nuorodos" in the top-right corner;
4. In the "Nuorodos" dropdown, click  "Prisijungti";
5. Enter login details:
  * test email address: Cocococonut144@gmail.com;
  * test password: Coconut123;
6. Click "Prisijungti";
7. Click "Nuorodos";
8. Click button for more options;
9. Click "Mano Paskyra"

*Expected Result: In the page My Account in the box under contact information full name Coco Coconut
will appear.*

#### 1.2. Log in using unexisting account details

1. Go to the main page;
2. To Accept Cookies, click "Sutinku";
3. Click on "Nuorodos" in the top-right corner;
4. n the "Nuorodos" dropdown, click  "Prisijungti";
5. Enter login details:
  * unexisting email address: Lalala@msn.com;
  * unexisting password: Lalala123;
6. Click "Prisijungti";

*Expected result: The same page will remain, but above the login fields the red text "Neteisingas prisijungimo vardas arba slaptažodis." will appear.*

### 2. Item search using a search field
#### 2.1 Search for an existing item

1. Go to the main page;
2. To Accept Cookies, click "Sutinku";
3. Type the name of the item "Raudona riebi molio mase"
4. Select category "Molio masės" from dropdown "Visos kategorijos";
5. Click on the magnifier icon to search

*Expected result: New page with items will open, item with a name "Raudona riebi molio masė" will appear.*

#### 2.2 Search for an unexisting item

1. Go to the main page;
2. To Accept Cookies, click "Sutinku";
3. Type the name of the item "Rauuuu"
4. Select category "Molio masės" from dropdown "Visos kategorijos";
5. Click on the magnifier icon to search

*Expected result: New page will open, text "Pagal jūsų ieškotą frazę prekių nebuvo rasta." will appear.*

### 3. Cart

#### 3.1. Adding an item with specified quantity to cart

1. Go the page with items from search "Raudona riebi molio mase";
2. To Accept Cookies, click "Sutinku";
3. On the first item "Raudona riebi molio masė", click button "Į Krepšelį";
4. Enter new quantity for 20kg - 2;
5. Enter new quantity for 5kg - 2;
6. Below click button "Į Krepšelį"

*Expected result: Number in the Basket Icon (Top-right) will change from 0 to 4.*

### 4. Sort items

#### 4.1.  Sort items by price, using an arrow button (highest to lowest)

1. Go the page of the Item Group "Porcelianas"
2. To Accept Cookies, click "Sutinku";
3. Click on the sort by dropdown menu and choose "Kaina";
4. Save the values before sorting;
5. Click on the arrow to set a descending direction;
6. Save the values after sorting;
7. Compare the values;

*Expected result: The compared values will be equal. The product will be sorted from highest price to the lowest (we check if the values are correctly sorted).*

### 5. Sidebar filter

#### 5.1. Check label appearance after setting a price filter to 1,55€ - 3,55 €

1. Go to the main page;
2. To Accept Cookies, click "Sutinku";
3. In the main page, top menu-bar, mouse-hover onto "Prekių katalogas" to see the options;
4. From the menu choose "Vokiška glazūra";
5. In the sidebar under "VOKIŠKA GLAZŪRA, click "BOTZ" and wait for a new page to load;
6. In the slider choose price between 1,55€ - 3,55 €;

*Expected result: Under "Filtruojama pagal" section the label "KAINA" with a chosen price will appear.*

#### 5.2. The correct items are given, after setting a price filter to 1,55€ - 3,55 €

1. Go to the main page;
2. To Accept Cookies, click "Sutinku";
3. In the main page, top menu-bar, mouse-hover onto "Prekių katalogas" to see the options;
4. From the menu choose "Vokiška glazūra";
5. In the sidebar under "VOKIŠKA GLAZŪRA, click "BOTZ" and wait for a new page to load;
6. In the slider choose price between 1,55€ - 3,55 €;
7. Save the price values of the items given, check if they are between 1,55€ - 3,55 €;

*Expected result: The condition that values of all given items fall in the range between 1,55€ - 3,55 € is true.*

#### 5.3. The incorrect items are given, after setting a price filter to 1,55€ - 4,55 €

1. Go to the main page;
2. To Accept Cookies, click "Sutinku";
3. In the main page, top menu-bar, mouse-hover onto "Prekių katalogas" to see the options;
4. From the menu choose "Vokiška glazūra";
5. In the sidebar under "VOKIŠKA GLAZŪRA, click "BOTZ" and wait for a new page to load;
6. In the slider choose price between 1,55€ - 4,55 €;
7. Save the price values of the items given, check if they are between 1,55€ - 4,55 €;

*Expected result: The condition that values of all given items fall in the range between 1,55€ - 4,55 € is false.* 

#### 5.4. Filtering out a specific item - Botz White 9876 glaze

1. Go to the main page;
2. To Accept Cookies, click "Sutinku";
3. In the main page, top menu-bar, mouse-hover onto "Prekių katalogas" to see the options;
4. From the menu choose "Vokiška glazūra";
5. In the sidebar under "VOKIŠKA GLAZŪRA, click "BOTZ" and wait for a new page to load;
6. In the slider choose price between 1,55€ - 4,55 €;
7. From "Dengiamumas" select "Dengianti";
8. From "Blizgesio lygis" select "Blizgus";
9. From "Glazuros savybes" select "Rekomenduojama indams";
10. From "Colour" select "Balta";

*Expected result: Item "Botz White 9876" will appear as the first item.* 

