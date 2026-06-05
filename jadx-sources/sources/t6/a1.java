package t6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a1 implements Parcelable {
    public static final Parcelable.Creator<a1> CREATOR = new pc.j(12);
    public boolean A;
    public boolean B;
    public boolean C;

    /* renamed from: a, reason: collision with root package name */
    public int f15822a;

    /* renamed from: b, reason: collision with root package name */
    public int f15823b;

    /* renamed from: c, reason: collision with root package name */
    public int f15824c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f15825d;

    /* renamed from: e, reason: collision with root package name */
    public int f15826e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f15827f;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f15828z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15822a);
        parcel.writeInt(this.f15823b);
        parcel.writeInt(this.f15824c);
        if (this.f15824c > 0) {
            parcel.writeIntArray(this.f15825d);
        }
        parcel.writeInt(this.f15826e);
        if (this.f15826e > 0) {
            parcel.writeIntArray(this.f15827f);
        }
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeList(this.f15828z);
    }
}
