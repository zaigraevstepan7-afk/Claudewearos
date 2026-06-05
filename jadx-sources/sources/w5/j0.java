package w5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new pc.j(16);
    public ArrayList A;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f18667a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f18668b;

    /* renamed from: c, reason: collision with root package name */
    public b[] f18669c;

    /* renamed from: d, reason: collision with root package name */
    public int f18670d;

    /* renamed from: e, reason: collision with root package name */
    public String f18671e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f18672f;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f18673z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f18667a);
        parcel.writeStringList(this.f18668b);
        parcel.writeTypedArray(this.f18669c, i10);
        parcel.writeInt(this.f18670d);
        parcel.writeString(this.f18671e);
        parcel.writeStringList(this.f18672f);
        parcel.writeTypedList(this.f18673z);
        parcel.writeTypedList(this.A);
    }
}
