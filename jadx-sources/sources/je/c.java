package je;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.a1;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class c extends zab {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                zac.zab(parcel);
                break;
            case 4:
                zac.zab(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                zac.zab(parcel);
                break;
            case 7:
                zac.zab(parcel);
                break;
            case 8:
                g gVar = (g) zac.zaa(parcel, g.CREATOR);
                zac.zab(parcel);
                q0 q0Var = (q0) this;
                q0Var.f3579b.post(new a1(3, q0Var, gVar));
                break;
            case 9:
                zac.zab(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
