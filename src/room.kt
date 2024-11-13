class room(val roomNumber: String, var osType: String, val computerID: Int) {

    val rooms = mutableListOf(
        room(roomNumber = "JM606", osType = "Windows", computerID = 20),
        room(roomNumber = "JM607", osType = "Linux", computerID = 15),
        room(roomNumber = "JM608", osType = "Mac", computerID = 21)

    )

    fun viewRooms() {
        println("Available Rooms:")
        rooms.forEach { room ->
            println("Room Number: ${room.roomNumber}, OS: ${room.osType}, Computers: ${room.computerID}")
        }
    }
}