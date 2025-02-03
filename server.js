const express = require("express");
const path = require("path");
const app = express();

app.listen(8000, function() {
    console.log("8000 server is running...");
});

app.use(express.static(path.join(__dirname, "front_knitting/dist")));

app.get("/", function(request, response) {
    response.sendFile(path.join(__dirname, "/front_knitting/dist/index.html"));
});