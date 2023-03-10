
const cart = {
    addToCart(id) {
        console.log(1)
        let listItem = JSON.parse(localStorage.getItem("listItem")) || []
        if (listItem.filter(item => item.id == id).length == 0){
            listItem.push({id, quantity: 1})
        }
        else
        {
            listItem.forEach(item => {
                if (item.id == id) {
                    item.quantity+=1;
                }
            })
        }
        localStorage.setItem("listItem", JSON.stringify(listItem));
    },

    fetchMyCart() {
        let myCart = JSON.parse(localStorage.getItem("list")) || [];
        if (myCart.length == 0) return [];
        fetch("http://localhost:8080/my-cart", {
            method: "post",
            body: {
                cart:JSON.stringify(myCart)
            },
            headers: {
                'Content-Type': 'application/json'
            }
        })
        .then(res => res.json())
        .then(data => {
            console.log(data);
        })
    }

}
export default cart