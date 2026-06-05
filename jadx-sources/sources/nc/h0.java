package nc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbhl;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhq;
import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbia;
import com.google.android.gms.internal.ads.zzbib;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzbmw;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class h0 extends zzays implements i0 {
    public h0() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        z xVar = null;
        e1 e1Var = null;
        switch (i10) {
            case 1:
                f0 f0VarZze = zze();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, f0VarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    xVar = iInterfaceQueryLocalInterface instanceof z ? (z) iInterfaceQueryLocalInterface : new x(strongBinder);
                }
                zzayt.zzc(parcel);
                zzl(xVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbhl zzbhlVarZzb = zzbhk.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzf(zzbhlVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbho zzbhoVarZzb = zzbhn.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzg(zzbhoVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbhu zzbhuVarZzb = zzbht.zzb(parcel.readStrongBinder());
                zzbhr zzbhrVarZzb = zzbhq.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzh(string, zzbhuVarZzb, zzbhrVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbgc zzbgcVar = (zzbgc) zzayt.zza(parcel, zzbgc.CREATOR);
                zzayt.zzc(parcel);
                zzo(zzbgcVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    e1Var = iInterfaceQueryLocalInterface2 instanceof e1 ? (e1) iInterfaceQueryLocalInterface2 : new e1(strongBinder2);
                }
                zzayt.zzc(parcel);
                zzq(e1Var);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbhy zzbhyVarZzb = zzbhx.zzb(parcel.readStrongBinder());
                s3 s3Var = (s3) zzayt.zza(parcel, s3.CREATOR);
                zzayt.zzc(parcel);
                zzj(zzbhyVarZzb, s3Var);
                parcel2.writeNoException();
                return true;
            case 9:
                ic.g gVar = (ic.g) zzayt.zza(parcel, ic.g.CREATOR);
                zzayt.zzc(parcel);
                zzp(gVar);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbib zzbibVarZzb = zzbia.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzk(zzbibVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbmn zzbmnVar = (zzbmn) zzayt.zza(parcel, zzbmn.CREATOR);
                zzayt.zzc(parcel);
                zzn(zzbmnVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbmw zzbmwVarZzb = zzbmv.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzi(zzbmwVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                ic.a aVar = (ic.a) zzayt.zza(parcel, ic.a.CREATOR);
                zzayt.zzc(parcel);
                zzm(aVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
