package nc;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class e0 extends zzays implements f0 {
    public e0() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            q3 q3Var = (q3) zzayt.zza(parcel, q3.CREATOR);
            zzayt.zzc(parcel);
            zzg(q3Var);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 2) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
            return true;
        }
        if (i10 == 3) {
            boolean zZzi = zzi();
            parcel2.writeNoException();
            int i12 = zzayt.zza;
            parcel2.writeInt(zZzi ? 1 : 0);
            return true;
        }
        if (i10 == 4) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        q3 q3Var2 = (q3) zzayt.zza(parcel, q3.CREATOR);
        int i13 = parcel.readInt();
        zzayt.zzc(parcel);
        zzh(q3Var2, i13);
        parcel2.writeNoException();
        return true;
    }
}
