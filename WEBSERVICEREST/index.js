/*
*Restful services by nodejs
*Author Med - Ouz - Rango Cheikh
*Since 30/07/2019
*/
var express = require('express');
var mysql = require('mysql');
var bodyParser = require('body-parser');
var path = require('path');

var con = mysql.createConnection({

    host:"localhost",
    user:"root",
    password:"passer",
    database:"mglsi_news"
});
var app = express();
app.use(bodyParser.urlencoded({extended : true}));
app.use(bodyParser.json());


//Lister l'ensemble des articles
app.get("/", (req, res, next) => {
    
    con.query("Select * from Article", function(err, result, fields){
        if(err) throw err;
        res.end(JSON.stringify(result), format(result));
    });

});

//lister les  categories
app.get("/categories", (req, res, next) =>{

    con.query("SELECT * FROM Categorie ", function(err, result, fields) {
        if(err) throw err;
        res.end(JSON.stringify(result));
    })
});

//lister les articles d'un categorie
 app.get("/articlesbycategorie/:categorie", (req, res, next) =>{

    console.log(req.params.categorie);
   con.query('SELECT * FROM Article WHERE categorie = ?',[req.params.categorie], function(err, result, fields) {
        if(err) throw err;
        res.end(JSON.stringify(result));
    })
});

//start webservice
app.listen(3000, ()=> {
    console.log("MGLSI_NEWS  WEBSERVICE running on port 3000");
})
