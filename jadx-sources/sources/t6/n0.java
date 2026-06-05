package t6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 extends k5.b {
    public static final Parcelable.Creator<n0> CREATOR = new t1.p(9);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f15970c;

    public n0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15970c = parcel.readParcelable(classLoader == null ? e0.class.getClassLoader() : classLoader);
    }

    @Override // k5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f15970c, 0);
    }
}
