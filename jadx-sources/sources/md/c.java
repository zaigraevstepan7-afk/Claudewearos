package md;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11610a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11610a) {
            case 0:
                int iK0 = v.k0(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iK0) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        v.f0(i10, parcel);
                    } else {
                        intent = (Intent) v.u(parcel, i10, Intent.CREATOR);
                    }
                }
                v.F(iK0, parcel);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f11610a) {
            case 0:
                return new a[i10];
            default:
                return new g[i10];
        }
    }
}
