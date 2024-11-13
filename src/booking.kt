class booking {
    val bookings = mutableListOf<booking>()

    fun createbooking (studentId: String, roomNumber: String, computerId: String, date: String, timeSlot: String): booking? {
        val computer = room.id.find { it.id == computerId && it.status == "available" }



}
