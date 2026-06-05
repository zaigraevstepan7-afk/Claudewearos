package nc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbau;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbwt;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class w0 extends zzays implements x0 {
    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        s0 r0Var = null;
        u0 t0Var = null;
        switch (i10) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(j3.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    r0Var = iInterfaceQueryLocalInterface instanceof s0 ? (s0) iInterfaceQueryLocalInterface : new r0(strongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                }
                zzayt.zzc(parcel);
                zzp(arrayListCreateTypedArrayList, r0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                zzayt.zzc(parcel);
                boolean zZzu = zzu(string);
                parcel2.writeNoException();
                parcel2.writeInt(zZzu ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                zzayt.zzc(parcel);
                zzbwt zzbwtVarZzm = zzm(string2);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbwtVarZzm);
                return true;
            case 4:
                String string3 = parcel.readString();
                zzayt.zzc(parcel);
                boolean zZzs = zzs(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                zzayt.zzc(parcel);
                zzbau zzbauVarZzh = zzh(string4);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbauVarZzh);
                return true;
            case 6:
                String string5 = parcel.readString();
                zzayt.zzc(parcel);
                boolean zZzt = zzt(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                zzayt.zzc(parcel);
                m0 m0VarZzj = zzj(string6);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, m0VarZzj);
                return true;
            case 8:
                zzbpo zzbpoVarZzf = zzbpn.zzf(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzo(zzbpoVarZzf);
                parcel2.writeNoException();
                return true;
            case 9:
                String string7 = parcel.readString();
                j3 j3Var = (j3) zzayt.zza(parcel, j3.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    t0Var = iInterfaceQueryLocalInterface2 instanceof u0 ? (u0) iInterfaceQueryLocalInterface2 : new t0(strongBinder2, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                }
                zzayt.zzc(parcel);
                boolean zZzv = zzv(string7, j3Var, t0Var);
                parcel2.writeNoException();
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 10:
                int i12 = parcel.readInt();
                String string8 = parcel.readString();
                zzayt.zzc(parcel);
                boolean zZzr = zzr(i12, string8);
                parcel2.writeNoException();
                parcel2.writeInt(zZzr ? 1 : 0);
                return true;
            case 11:
                String string9 = parcel.readString();
                zzayt.zzc(parcel);
                m0 m0VarZzi = zzi(string9);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, m0VarZzi);
                return true;
            case 12:
                String string10 = parcel.readString();
                zzayt.zzc(parcel);
                zzbau zzbauVarZzg = zzg(string10);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbauVarZzg);
                return true;
            case 13:
                String string11 = parcel.readString();
                zzayt.zzc(parcel);
                zzbwt zzbwtVarZzl = zzl(string11);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbwtVarZzl);
                return true;
            case 14:
                int i13 = parcel.readInt();
                String string12 = parcel.readString();
                zzayt.zzc(parcel);
                j3 j3VarZzk = zzk(i13, string12);
                parcel2.writeNoException();
                zzayt.zze(parcel2, j3VarZzk);
                return true;
            case 15:
                int i14 = parcel.readInt();
                zzayt.zzc(parcel);
                Bundle bundleZzf = zzf(i14);
                parcel2.writeNoException();
                zzayt.zze(parcel2, bundleZzf);
                return true;
            case 16:
                int i15 = parcel.readInt();
                String string13 = parcel.readString();
                zzayt.zzc(parcel);
                int iZze = zze(i15, string13);
                parcel2.writeNoException();
                parcel2.writeInt(iZze);
                return true;
            case 17:
                int i16 = parcel.readInt();
                String string14 = parcel.readString();
                zzayt.zzc(parcel);
                boolean zZzq = zzq(i16, string14);
                parcel2.writeNoException();
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 18:
                int i17 = parcel.readInt();
                zzayt.zzc(parcel);
                zzn(i17);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
