package d3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f4723a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f4723a == ((j) obj).f4723a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4723a);
    }

    public final String toString() {
        int i10 = this.f4723a;
        return i10 == 0 ? "Button" : i10 == 1 ? "Checkbox" : i10 == 2 ? "Switch" : i10 == 3 ? "RadioButton" : i10 == 4 ? "Tab" : i10 == 5 ? "Image" : i10 == 6 ? "DropdownList" : i10 == 7 ? "Picker" : i10 == 8 ? "Carousel" : "Unknown";
    }
}
