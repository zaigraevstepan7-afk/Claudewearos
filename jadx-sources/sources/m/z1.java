package m;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z1 extends k5.b {
    public static final Parcelable.Creator<z1> CREATOR = new t1.p(5);

    /* renamed from: c, reason: collision with root package name */
    public int f11216c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11217d;

    public z1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f11216c = parcel.readInt();
        this.f11217d = parcel.readInt() != 0;
    }

    @Override // k5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f11216c);
        parcel.writeInt(this.f11217d ? 1 : 0);
    }
}
