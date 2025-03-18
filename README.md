**Tech Stack for Oxitech Android App (IoT + Bluetooth + Health Monitoring)**

---

## **1. Programming Languages & UI**
- **Kotlin** - Core language for Android development
- **XML** - UI design using Android Views & Material Design
- **Jetpack Compose** *(optional)* - Modern UI approach

---

## **2. Data Transfer & IoT Communication**
- **Bluetooth Classic / BLE** - Connect & receive data from IoT device
- **High-Signal Connection Handling** - Auto-reconnect for stable data transfer

**Libraries for Bluetooth:**
- [Android Bluetooth API](https://developer.android.com/reference/android/bluetooth/BluetoothAdapter) (For Classic Bluetooth)
- [Bluetooth Low Energy (BLE)](https://developer.android.com/reference/android/bluetooth/le) (For power-efficient communication)

**Alternative:**
- **MQTT over WiFi** *(if Bluetooth signal is weak in some areas)*

---

## **3. UI Components & Libraries**
- **Material Components** - Modern UI with Material Design
- **Lottie Animations** - Smooth UI animations ([Lottie](https://airbnb.io/lottie/))
- **MPAndroidChart** - For interactive health graphs ([MPAndroidChart](https://github.com/PhilJay/MPAndroidChart))

---

## **4. Local Storage (For Previous Health Data)**
- **Room Database (SQLite)** - Store health records locally
- **SharedPreferences** - Store user preferences (theme, settings, alerts)

**Alternative:**
- **Realm Database** *(for faster local storage & syncing)*

---

## **5. SOS System & Emergency Features**
- **Firebase Firestore** - Store & retrieve emergency contacts
- **Firebase Cloud Messaging (FCM)** - Send SOS notifications
- **Call & SMS APIs** - Direct emergency calling from the app

**Example API for Calling in Kotlin:**
```kotlin
val intent = Intent(Intent.ACTION_CALL)
intent.data = Uri.parse("tel:+911234567890")
startActivity(intent)
```

---

## **6. Data Visualization & Analytics**
- **MPAndroidChart** - For heart rate & temperature trends
- **Google Analytics for Firebase** - Track user activity & app usage

---

## **7. Testing & Debugging**
- **Android Debug Bridge (ADB)** - Debug Bluetooth connections
- **Espresso & UIAutomator** - Automated UI testing

---

## **8. Deployment & CI/CD**
- **GitHub Actions / Fastlane** - Automate builds & releases
- **Play Store Deployment** - Publish app for users

---

## **Tech Stack Overview Table**

| **Category**        | **Technology/Library**        |
|---------------------|-----------------------------|
| **Language**        | Kotlin                      |
| **UI Design**       | XML, Material Components   |
| **Bluetooth Data**  | Bluetooth Classic, BLE API |
| **Storage**        | Room Database, Firestore   |
| **Graphs & Charts** | MPAndroidChart             |
| **SOS Feature**     | Firebase FCM, Call API     |
| **Testing**        | Espresso, ADB Debugging    |
| **CI/CD**         | GitHub Actions, Fastlane   |

---

## **Next Steps:**
1. **Set up Bluetooth connection & receive IoT data**
2. **Design interactive UI with XML & Material Components**
3. **Implement local storage for health data**
4. **Develop SOS system with Firebase integration**
5. **Optimize & test for performance**

---

### **Prepared by:**
Suman Kumar Dey

