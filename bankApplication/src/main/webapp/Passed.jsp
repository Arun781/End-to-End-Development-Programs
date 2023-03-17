<!DOCTYPE html>
<html>

    <head>
        <title>Online Banking Website</title>
        <link href="https://fonts.googleapis.com/css2?family=Patua+One&display=swap" rel="stylesheet">
        <!-- <script src="../Java Script/homeJS.js"></script> -->
    </head>

    <body>
        <div id="header" class="head">
            <h1>Online Banking Website</h1>
            <a href="home.html"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTK__L7wxH4f58z-o5ItAc4EEOcy9FAkGCDnQ&usqp=CAU" alt="Online Banking System"
                    title="Online Banking Website"></a>
        </div>
        <div id="log_sign">
            <li><a href="index.jsp">Login</a></li>
            <li><a href="CustomerReg">Sign Up</a></li>
        </div>
        <div id="navbar">
            <div id="nav">
                <div id="services">
                    <li><a href="#">Services .</a></li>
                    <nav class="content">
                        <li><a href="perIntBank.html">Personal Internet Banking</a></li>
                        <li><a href="corpBank.html">Corprorate Banking</a></li>
                        <li><a href="merBusiness.html">Merchant Bussiness</a></li>
                        <li><a href="onlTax.html">Online Tax</a></li>
                    </nav>
                </div>
                <div id="payment_transfer">
                    <li><a href="#">Payment Transfer .</a></li>
                    <nav class="content">
                        <li><a href="intTransfer.html">International Transfer</a></li>
                        <li><a href="natTransfer.html">National Transfer</a></li>
                        <li><a href="billPay.html">Bill Payment</a></li>
                    </nav>
                </div>
                <div id="fixed_deposite">
                    <li><a href="fixDep.html">Fixed Deposite</a></li>
                </div>
                <div id="e_service">
                    <li><a href="eServ.html">E - Services</a></li>
                </div>
                <div id="acc">
                    <li><a href="acc.html">My Account</a></li>
                </div>
            </div>
        </div>
        <div class="slideshow-container">
            <div class="mySlides fade">
                <div class="numbertext">1 / 3</div>
                <img src="https://www.enterpriseedges.com/wp-content/uploads/2020/11/What-is-Online-Banking-System.jpg">
            </div>
            <div class="mySlides fade">
                <div class="numbertext">2 / 3</div>
                <img src="https://www.thebalancemoney.com/thmb/bSjZ_Zupaix4ySDwmpPynwOCKvI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/what-is-an-online-bank-315204_final-98ce36e857d245d2867e28fa4c189111.png">
            </div>
            <div class="mySlides fade">
                <div class="numbertext">3 / 3</div>
                <img src="https://cdn-icons-png.flaticon.com/512/458/458219.png">
            </div>
        </div>
        <br>
        <div style="text-align:center">
            <span class="dot"></span>
            <span class="dot"></span>
            <span class="dot"></span>
        </div>
        <script>
            var slideIndex = 0;
            showSlides();

            function showSlides()
            {
                var i;
                var slides = document.getElementsByClassName( "mySlides" );
                var dots = document.getElementsByClassName( "dot" );
                for ( i = 0; i < slides.length; i++ ) {
                    slides[ i ].style.display = "none";
                }
                slideIndex++;
                if ( slideIndex > slides.length ) { slideIndex = 1 }
                for ( i = 0; i < dots.length; i++ ) {
                    dots[ i ].className = dots[ i ].className.replace( " active", "" );
                }
                slides[ slideIndex - 1 ].style.display = "block";
                dots[ slideIndex - 1 ].className += " active";
                setTimeout( showSlides, 2000 ); // Change image every 2 seconds
            }
        </script>
        <div id="disp">
            <div>
                <input type="text" placeholder="Beneficiary Name" >
                <input type="text"  placeholder="Account No">
                <input type="text" di placeholder="Branch Name">
                <input type="text"placeholder="IFSC Code">
            </div>
        </div>
        <div id="foot">
            <a href="aboutUs.html">About Us</a>
        </div>
    </body>
<style>
	/*for Header and Login and Signup*/
*{
    box-sizing:border-box;
    font-family: 'Times New Roman', serif;
}

body{
    background-color: black;
    background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNduHZEKPAuJCJ-PGcgI6KV4AP7csqiZkQ7aik52es&s");
    background-position: center;
}

h1{
    text-align: center;
    font-family: 'Times New Roman', serif;
    font-weight:bolder;
    height:75px;
    word-spacing: 1.5px;
    letter-spacing: 5px;
    padding-top:20px;
    margin: 0px;
    font-size:50px;
    text-shadow: 5px 5px 5px grey;
}
.head{
    position: fixed;
    top:0px;
}
#header img{
    height:75px;
    width:300px;
    border-radius:20px;
    position:absolute;
    top:10px;
    left:25px;
}
img:hover{
    border:15px solid black;
    transition-duration: 0.20s;
}
#header{
    background-color: #f5009bdd;
    height:100px;
    width:100em;
    margin-bottom: 10px;
    /* border-bottom-left-radius: 50px;
    border-bottom-right-radius: 50px; */
}
#log_sign{
    padding-top:25px;
    width:300px;
    position:absolute;
    top:10px;
    right:10px;
    font-weight:bolder;
}
#log_sign li{
    list-style: none;
    display: inline;
    margin-right: 10px;
}
#log_sign li a{
    text-decoration:none;            
    color:black;
    font-size:25px;
}
#log_sign li a:hover{
    text-decoration: underline;
    border-radius:30px;
    border:3px solid black;
    padding:10px;
    transition-duration: 0.20s;
}
a{
    color: black;
    font-weight: bolder;
    text-decoration: none;
}
/*
    for small screen
*/
@media(max-width:1340px) { 
    #header h1{
        display: none;
    }
    #header{
        width:100%;
    }
    img{
        position:static;
        margin:0px 0px;
        display: inline-block;
        width:300px;
    }
    #log_sign{
        position:absolute;
        top:10px;
        right:25px;
        display: inline-block;
        width:200px;
    }
}

/*For Nav Bar*/
.content{
    display: none;
}
div li{
    list-style: none;
    display: block;
}
#navbar div{
    display: inline-block;
}
#navbar{
    width:100%;
    display: flex;
    justify-content:space-evenly;
    flex-direction: row;
    /* background-image: linear-gradient(red,orange); */
    background-color: #f5009bdd;
    padding:20px;
    margin:120px auto 0px;
    width:1000px;
    font-size: 20px;
    border-radius:30px;
    height:100px;
}
#nav div{
    border:2px solid black;
    border-radius: 30px;
    text-align: center;
    padding:10px;
}

#nav div:hover{
    background-color:rgb(255, 0, 123);
    transition-property: "background-image";
    transition-duration: 0.25s;
}

/*For content drop down*/
.content{
    display: none;
    position:absolute;
    margin-top:15px;
    z-index: 1;
    text-align: left;
    border:2px solid black;
    border-radius: 20px;
    padding:10px;
    background-color:rgb(255, 0, 123);
    color:rgb(8, 8, 8);
}
.content li{
    border-bottom: 2px dashed rgb(10, 10, 10);
    padding:0px 10px;
}
.content li:last-child{
    border-bottom:none;
}
.content li:hover{
    background-color:rgb(255, 0, 123);
    border-radius:30px;
}
#nav div:hover .content{
    display: block;    
}

/*for about us */
#foot{
    position: fixed;
    bottom:0px;    
    background-color: rgb(255, 0, 123);
    /* border-top-left-radius: 50px;
    border-top-right-radius: 50px; */
    display: block;
    width: 100%;
    opacity: .7;
    padding:30px;
}
#foot a{
    font-size:30px;
    font-weight: bolder;
}
#foot a:hover{
    border-radius:30px;
    border:3px solid black;
    padding:5px;
}
/* div#disp{
    position: relative;
    left:0px;
} */
@media(max-height:700px){
    div#disp{
        position: relative;
        top:50px;
        left:70px
    
    }
}
.disp.dev{
    display: flex;
    width:100%;
    justify-content: space-evenly;
}
input{
    text-decoration-color: #030303;
    font-weight: bold;
    box-sizing:border-box;
    height:50px;
    border-radius:30px;
    opacity: 0.7;
    border-color: black;
    padding:20px;
    font: 1em sans-serif;
    width:300px;
    text-align: center;
    margin: 45px;
    background-color: rgb(255, 0, 123);
}

/* Slideshow pictures */
.mySlides 
{
    display: none;
    z-index:0;
}
.slideshow-container img
{
    vertical-align: middle;
    height:300px;
    width:500px;
    border-radius: 30px;
    z-index: 0;
}

/* Slideshow container */
.slideshow-container {
    position: relative;
    max-width: 1000px;
    top:20px;
    left:250px;
    margin: 0px auto;
    z-index:0;
}

/* Caption text */
.text {
    color: #130404;
    font-size: 15px;
    padding: 8px 12px;
    position: absolute;
    bottom: 8px;
    width: 100%;
    text-align: center;
    z-index: 0;
    z-index:0;
}

/* Number text (1/3 etc) */
.numbertext {
    color:black;
    font-size: 12px;
    padding: 8px 12px;
    position: absolute;
    top: 0;
    z-index:0;
}

/* The dots/bullets/indicators */
.dot {
    height: 15px;
    width: 15px;
    margin: 0 2px;
    background-color: #040404;
    border-radius: 50%;
    display: inline-block;
    transition: background-color 0.6s ease;
    z-index:0;
}

.active {
    background-color: #030303;
}
/* Fading animation */
.fade {
    -webkit-animation-name: fade;
    -webkit-animation-duration: 1.5s;
    animation-name: fade;
    animation-duration: 1.5s;
    z-index:0;
}

@-webkit-keyframes fade {
    from {opacity: .4} 
    to {opacity: 1}
}

@keyframes fade {
    from {opacity: .4} 
    to {opacity: 1}
}

/* On smaller screens, decrease text size */
@media only screen and (max-width: 300px) {
    .text {font-size: 11px}
}
</style>
</html>