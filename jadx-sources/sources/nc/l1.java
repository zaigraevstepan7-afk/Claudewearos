package nc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpo;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class l1 extends zzays implements m1 {
    public l1() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        w1 u1Var;
        switch (i10) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float f10 = parcel.readFloat();
                zzayt.zzc(parcel);
                zzq(f10);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                zzayt.zzc(parcel);
                zzr(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzg = zzayt.zzg(parcel);
                zzayt.zzc(parcel);
                zzp(zZzg);
                parcel2.writeNoException();
                return true;
            case 5:
                xd.a aVarN = xd.b.n(parcel.readStrongBinder());
                String string2 = parcel.readString();
                zzayt.zzc(parcel);
                zzn(aVarN, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                xd.a aVarN2 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzl(string3, aVarN2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zZzv = zzv();
                parcel2.writeNoException();
                int i12 = zzayt.zza;
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                zzayt.zzc(parcel);
                zzh(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbpo zzbpoVarZzf = zzbpn.zzf(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzo(zzbpoVarZzf);
                parcel2.writeNoException();
                return true;
            case 12:
                zzbmi zzbmiVarZzc = zzbmh.zzc(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzs(zzbmiVarZzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                k3 k3Var = (k3) zzayt.zza(parcel, k3.CREATOR);
                zzayt.zzc(parcel);
                zzu(k3Var);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    u1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    u1Var = iInterfaceQueryLocalInterface instanceof w1 ? (w1) iInterfaceQueryLocalInterface : new u1(strongBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                }
                zzayt.zzc(parcel);
                zzm(u1Var);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zZzg2 = zzayt.zzg(parcel);
                zzayt.zzc(parcel);
                zzj(zZzg2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                zzayt.zzc(parcel);
                zzt(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
