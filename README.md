# SellerProductAPI

"first set the database name and port number in application.properties file"

****************************************************************************

To fetch the all product : GET request  -> localhost:8080/

******************************************************************************
Add the product : POST request -> localhost:8080/addProduct give the json data</br>
Json data is : 
{
        "sku":"sku id ",
        "title":"product title",
        "quantity": 10,
        "mrp": 7000,
        "material":"seremic plastic",
        "imageUrl1":"this is image url 1",
        "imageUrl2":"this is image url 2",
        "imageUrl3":"this is image url 3",
        "imageUrl4":"this is image url 4",
        "imageUrl5":"this is image url 5",
        "brand":"this is brand name",
        "color":"product colors",
        "description":"product description",
        "userId":"user id"
    }
    
****************************************************************************   
	
To search the product : localhost:8080/search/{searchKeyHere}

*******************************************************************************

If you want the add the product to cart :GET request localhost:8080/addToCart/{product_reference_Id}
To show the cart : GET request localhost:8080/showCart 

*******************************************************************************
* To place the order : POST request localhost:8080/placeOrder give the json data </br>
Json data is :
{
    "buyerName": "Amar desai",
    "buyerPhonenumber": "8808813455",
    "recepientName": "Amar desai",
    "shippingAddr1": "This is frist addr1",
    "shippingAddr2": null,
    "shippingAddr3": null,
    "city": "Nashik",
    "state": "Maharashtra",
    "country": "India",
    "postalCode": "564534",
    "shipPhoneNumber": "7890564534"
}
