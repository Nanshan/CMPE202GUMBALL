/**
 * Implements factory for Picker
 * 
 * @Anand Sherkhane
 * @1.0
 */
public class PickerFactory {
    public Picker getPicker(int pickerType) {
        if (pickerType == 0) {
            return new BluePicker();
        } else if (pickerType == 1) {
            return new GreenPicker();
        } else if (pickerType == 2) {
            return new RedPicker();
        } else if (pickerType == 3 ) {
            return new RandomPicker();
        } else {
            return null;
        }
    }
}
