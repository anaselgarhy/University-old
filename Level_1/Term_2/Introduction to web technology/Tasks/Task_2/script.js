// List of alpums elmints
var alpums =[
    {'title':'Art', 'url':'Art.html', 'mainUrl':'imges/Art'},
    {'title':'Nature', 'url':'Nature.html','mainUrl':'imges/Nature'},
    {'title':'Cats', 'url':'Cats.html','mainUrl':'imges/Cats'}
];

function set(num){
    document.getElementById("title_of_alpum").innerHTML = alpums[num].title;
    document.getElementById("url_of_alpum").href = alpums[num].url;
    document.getElementById("img_of_alpum").src = alpums[num].mainUrl + '/' + Math.floor((Math.random()*15)+1) + '.jpg';
}

// Current alpum
var current_alpum = Math.floor(Math.random()*3); // Get random value from 0 to 2

// Set alpum
function set_alpum(){
    set(current_alpum);
}

// Next buttn
function next(){
    if(current_alpum == 2)
        current_alpum = 0;
    else
        current_alpum++;
    // Set
    set(current_alpum);
}

// Prev buttn
function prev(){
    if(current_alpum == 0)
        current_alpum = 2;
    else
        current_alpum--;
    // Set 
    set(current_alpum);
}

//load imges
function loadImgs(alpum){
    var tempHtml= ' ';
    current_alpum = alpum;
    for(var i = 0; i < 15; i++)
        tempHtml += '<div class="card" id="card_' + (i+1) + '">' +
                    '<div class="card-cild">' +
                        '<img alt="" src="' + alpums[alpum].mainUrl + '/' + (i+1) + '.jpg' + '"/>' +
                        '<div class="toolbar">' +
                            '<div class="link">' +
                                '<a href="' + alpums[alpum].mainUrl + '/' + (i+1) + '.jpg' + '" download>' + 
                                    '<div class="download">' +
                                        '<p>Download</p>' +
                                    '</div>' +
                                '</a>' +
                            '</div>' +
                            '<div id= "favrots_' + (i+1) + '">' +
                                '<div class="like_button" id ="favrotsButton_' + (i+1) + '" onclick="'+ (cheackFavrots((i+1), 1) ? 'delFavrots(':'addFavrots(') + (i+1) +')' + 
                                '"><p id="favrotsButtonText_' + (i+1) + '">' + (cheackFavrots((i+1), 1)? 'Remove from ':'Add to ') + 'my fivrots</p></div>' +
                            '</div>' +
                        '</div>' +
                    '</div>' +
                '</div>' +
                '<br>';
    document.getElementById("loding").parentNode.removeChild(document.getElementById("loding"));
    document.getElementById("header").innerHTML = '<div class="title"><a href="./index.html"><h1>Beautiful wallpapers</h1></a></div>';
    document.getElementById("imgeees").innerHTML = '<div id="imges_scrol"></div>';
    document.getElementById("imges_scrol").innerHTML = tempHtml;
}

// Get random wallpaper
function getRandomWallpaper(){
    var randImg = Math.floor(Math.random()*15) + 1;
    document.getElementById("loding").parentNode.removeChild(document.getElementById("loding"));
    document.getElementById("looooad").innerHTML = '<div id="imges_scrol"></div>';
    document.getElementById("imges_scrol").innerHTML = 
    '<div class="card" id="card_' + randImg + '">' +
    '<div class="card-cild">' +
        '<img alt="" src="' + alpums[current_alpum].mainUrl + '/' + randImg + '.jpg' + '"/>' +
        '<div class="toolbar">' +
            '<div class="link">' +
                '<a href="' + alpums[current_alpum].mainUrl + '/' + randImg + '.jpg' + '" download>' + 
                    '<div class="download">' +
                        '<p>Download</p>' +
                    '</div>' +
                '</a>' +
            '</div>' +
            '<div id= "favrots_' + randImg + '">' +
                '<div class="like_button" id ="favrotsButton_' + randImg + '" onclick="'+ (cheackFavrots(randImg, 1) ? 'delFavrots(':'addFavrots(') + randImg+')' + 
                '"><p id="favrotsButtonText_' + randImg + '">' + (cheackFavrots(randImg, 1)? 'Remove from ':'Add to ') + 'my fivrots</p></div>' +
            '</div>' +
        '</div>' +
    '</div>' +
'</div>' +
'<br>';
}

// Add me
function me(){
    document.getElementById("footer").innerHTML = '<a href="https://github.com/Anas-Elgarhy"><p>Coding and design by me ^-^</p></a>';
}

// Cookies for save favertos
// Cheack  cookies fun
function cheakCookies(){
    var favrots = getCookies("favrotsIn" + alpums[current_alpum].title);
    if(favrots != "")
        return true;
    else
        return false;
}

// Set cookie
function setCookies(cvalue, exdays, option){
    var temp = "favrotsIn" + alpums[current_alpum].title;
    // end date
    var endDate = new Date();
    var date = new Date();
    endDate.setTime(endDate.getTime() +  (exdays*24*60*60*1000));
    // Cheak
    if(cheakCookies() && option == 1)
        temp += getCookies();
    else
        temp += "=";
    //
    if(option == 1)
        document.cookie = temp + cvalue + "|" + date.toLocaleTimeString() + ",;" + "expires="+ endDate.toUTCString() + ";path=/" + alpums[current_alpum].url;
    else
    {
        let tempSize = cvalue.length -1;
        document.cookie = temp + cvalue + (cvalue == ""? ";": ((cvalue[tempSize] != ",")? ",;":";")) + "expires="+ endDate.toUTCString() + ";path=/" + alpums[current_alpum].url;
    } 
}
// Get cookie
function getCookies(){
    let cname = "favrotsIn" + alpums[current_alpum].title;
    var decodedCookie = decodeURIComponent(document.cookie);
    var ca = decodedCookie.split(';');
    for(var i = 0; i <ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) == ' ') {
        c = c.substring(1);
        }
        if (c.indexOf(cname) == 0) {
        return c.substring(cname.length, c.length);
        }
    }
    return "";
}

// Delete cookikes
function delCookies(){
    document.cookie = "favrotsIn" + alpums[current_alpum].title + "=0|1:39:14 AM,;expires=Thu, 18 Dec 2013 12:00:00 UTC;path=/" + alpums[current_alpum].url;
}

/// This function want tow parameters, one parameter kye to you want cheak or search and tow parameter option to you want use
// Cheack alrdy in favrots
function cheackFavrots(key, option){
    let fav = new Array();
    // Get favrots in current alpum
    let favrots = getCookies().substring(1); // del "=" from return value
    // Split return value in array
    let alrdyIn = favrots.split(",");
    // Get favrots without Date
    for(let i=0; i < alrdyIn.length-1; i++)
    {
        let temp = alrdyIn[i].split("|");
        fav[i] = parseInt(temp[0]);
    }
    //
    if(fav.indexOf(parseInt(key)) < 0)
        if(option == 1)
            return false; 
        else
            return (-1);
    else
        if(option == 1)
            return true;
        else
            return (fav.indexOf(parseInt(key)));
}

// add favrots
function addFavrots(key){
    // Cheack secure
    if(!cheackFavrots(key, 1))
    {
        setCookies(key, 30, 1);
        // set favrotsButton
        document.getElementById("favrots_" + key).innerHTML = '<div class="like_button" id ="favrotsButton_' + key + '" onclick="delFavrots('+ key +')">'
        document.getElementById("favrotsButton_" + key).innerHTML = '<p>Remove from my favrots</p>';
    }
    else
        window.alert("The picture is already in you favorites");
}

// delete favrots
function delFavrots(key){
    // Get kay pos with binry search
    let pos = cheackFavrots(key, 2);
    // Delete 
    if(pos > -1)
    {
        // Get all favrots and store in locale array
        let allFavrots = getCookies().substring(1).split(",");
        allFavrots.splice(pos,1);
        let temp = allFavrots.toString();
        setCookies(temp, 30, 2);
        // Set button favorts
        document.getElementById("favrots_" + key).innerHTML = '<div class="like_button" id ="favrotsButton_' + key + '" onclick="addFavrots('+ key +')">'
        document.getElementById("favrotsButton_" + key).innerHTML = '<p>Add to my favrots</p>';
    }
    else
        window.alert("Error!!!!");
}

// Get all favorts
function getAllFavrots(){
    window.alert("Soooooooooooooooooooooooooooooooooooooooon ");
}