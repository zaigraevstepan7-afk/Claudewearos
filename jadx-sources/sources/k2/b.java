package k2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f9350a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f9350a == ((b) obj).f9350a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9350a);
    }

    public final String toString() {
        int i10 = this.f9350a;
        return i10 == 16 ? "Confirm" : i10 == 6 ? "ContextClick" : i10 == 13 ? "GestureEnd" : i10 == 23 ? "GestureThresholdActivate" : i10 == 3 ? "KeyboardTap" : i10 == 0 ? "LongPress" : i10 == 17 ? "Reject" : i10 == 27 ? "SegmentFrequentTick" : i10 == 26 ? "SegmentTick" : i10 == 9 ? "TextHandleMove" : i10 == 22 ? "ToggleOff" : i10 == 21 ? "ToggleOn" : i10 == 1 ? "VirtualKey" : "Invalid";
    }
}
