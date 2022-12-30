function validateForm() {
    let x = document.forms["name"].value;
    if (x == "") {
      alert("Name must be filled out");
      return false;
    }
  }