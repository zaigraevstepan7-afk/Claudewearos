package t6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z0 implements Parcelable {
    public static final Parcelable.Creator<z0> CREATOR = new pc.j(11);

    /* renamed from: a, reason: collision with root package name */
    public int f16087a;

    /* renamed from: b, reason: collision with root package name */
    public int f16088b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f16089c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16090d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f16087a + ", mGapDir=" + this.f16088b + ", mHasUnwantedGapAfter=" + this.f16090d + ", mGapPerSpan=" + Arrays.toString(this.f16089c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16087a);
        parcel.writeInt(this.f16088b);
        parcel.writeInt(this.f16090d ? 1 : 0);
        int[] iArr = this.f16089c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f16089c);
        }
    }
}
