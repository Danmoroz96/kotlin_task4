// Data Class to hold Product information
data class Product(
    val name: String,
    val company: String,
    val description: String,
    val contact: String
)

// Function to generate the text-based banner
fun generateProductBanner(product: Product) {
    val bannerWidth = 70
    val divider = "═".repeat(bannerWidth)

    // Helper function for centered text
    fun centerText(text: String): String {
        val totalPadding = bannerWidth - text.length
        val leftPadding = totalPadding / 2
        val rightPadding = totalPadding - leftPadding
        return " ".repeat(leftPadding) + text + " ".repeat(rightPadding)
    }

    // --- Product Banner Layout ---
    
    println("╔$divider╗")
    
    // Background Image Placeholder (Text Representation)
    println("║${centerText("-------------------------------------------------------")}║")
    println("║${centerText("|         [ PRODUCT IMAGE: NEBULA X-20 ]        |")}║")
    println("║${centerText("-------------------------------------------------------")}║")
    
    // Product Name (Large and Centered)
    println("╠$divider╣")
    println("║${centerText("")}║")
    println("║${centerText(product.name.uppercase())}║")
    println("║${centerText(product.description)}║")
    println("║${centerText("")}║")

    // Company and Contact Info (Bottom Alignment)
    println("╠$divider╣")
    
    // Left-aligned Company Name, Right-aligned Contact Info
    val companyLabel = " COMPANY: ${product.company}"
    val contactLabel = "${product.contact} CONTACT "
    
    // Calculate the space needed between the left and right labels
    val spaceNeeded = bannerWidth - companyLabel.length - contactLabel.length
    
    println("║$companyLabel${" ".repeat(spaceNeeded)}$contactLabel║")
    
    println("╚$divider╝")
}

fun main() {
    val myProduct = Product(
        name = "Nebula X-20 Headphones",
        company = "Aether Audio Solutions",
        description = "Ultimate Noise Cancellation & Clarity",
        contact = "support@aetheraudio.com"
    )

    generateProductBanner(myProduct)
}
