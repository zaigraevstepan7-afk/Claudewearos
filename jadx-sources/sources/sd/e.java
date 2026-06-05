package sd;

import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iK0 = v.k0(parcel);
        String strV = null;
        String strV2 = null;
        rd.b bVar = null;
        int iZ = 0;
        int iZ2 = 0;
        boolean zU = false;
        int iZ3 = 0;
        boolean zU2 = false;
        int iZ4 = 0;
        while (parcel.dataPosition() < iK0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iZ = v.Z(i10, parcel);
                    break;
                case 2:
                    iZ2 = v.Z(i10, parcel);
                    break;
                case 3:
                    zU = v.U(i10, parcel);
                    break;
                case 4:
                    iZ3 = v.Z(i10, parcel);
                    break;
                case 5:
                    zU2 = v.U(i10, parcel);
                    break;
                case 6:
                    strV = v.v(i10, parcel);
                    break;
                case 7:
                    iZ4 = v.Z(i10, parcel);
                    break;
                case '\b':
                    strV2 = v.v(i10, parcel);
                    break;
                case '\t':
                    bVar = (rd.b) v.u(parcel, i10, rd.b.CREATOR);
                    break;
                default:
                    v.f0(i10, parcel);
                    break;
            }
        }
        v.F(iK0, parcel);
        return new a(iZ, iZ2, zU, iZ3, zU2, strV, iZ4, strV2, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
