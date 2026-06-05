package t6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new pc.j(10);

    /* renamed from: a, reason: collision with root package name */
    public int f16020a;

    /* renamed from: b, reason: collision with root package name */
    public int f16021b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16022c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16020a);
        parcel.writeInt(this.f16021b);
        parcel.writeInt(this.f16022c ? 1 : 0);
    }
}
