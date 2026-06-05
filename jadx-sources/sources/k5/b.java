package k5;

import android.os.Parcel;
import android.os.Parcelable;
import t1.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f9454a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f9453b = new a();
    public static final Parcelable.Creator<b> CREATOR = new p(4);

    public b() {
        this.f9454a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f9454a, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f9454a = parcelable == f9453b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f9454a = parcelable == null ? f9453b : parcelable;
    }
}
