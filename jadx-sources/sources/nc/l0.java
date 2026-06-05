package nc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbaw;
import com.google.android.gms.internal.ads.zzbax;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzbdw;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbwf;
import com.google.android.gms.internal.ads.zzbwg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class l0 extends zzays implements m0 {
    public l0() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static m0 zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new k0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        z xVar = null;
        g1 f1Var = null;
        c0 a0Var = null;
        a2 z1Var = null;
        q0 o0Var = null;
        e1 e1Var = null;
        w vVar = null;
        b1 z0Var = null;
        switch (i10) {
            case 1:
                xd.a aVarZzn = zzn();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, aVarZzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzaa = zzaa();
                parcel2.writeNoException();
                int i12 = zzayt.zza;
                parcel2.writeInt(zZzaa ? 1 : 0);
                return true;
            case 4:
                q3 q3Var = (q3) zzayt.zza(parcel, q3.CREATOR);
                zzayt.zzc(parcel);
                boolean zZzab = zzab(q3Var);
                parcel2.writeNoException();
                parcel2.writeInt(zZzab ? 1 : 0);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    xVar = iInterfaceQueryLocalInterface instanceof z ? (z) iInterfaceQueryLocalInterface : new x(strongBinder);
                }
                zzayt.zzc(parcel);
                zzD(xVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    z0Var = iInterfaceQueryLocalInterface2 instanceof b1 ? (b1) iInterfaceQueryLocalInterface2 : new z0(strongBinder2);
                }
                zzayt.zzc(parcel);
                zzG(z0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                s3 s3VarZzg = zzg();
                parcel2.writeNoException();
                zzayt.zze(parcel2, s3VarZzg);
                return true;
            case 13:
                s3 s3Var = (s3) zzayt.zza(parcel, s3.CREATOR);
                zzayt.zzc(parcel);
                zzF(s3Var);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbtx zzbtxVarZzb = zzbtw.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzM(zzbtxVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbua zzbuaVarZzb = zzbtz.zzb(parcel.readStrongBinder());
                String string = parcel.readString();
                zzayt.zzc(parcel);
                zzQ(zzbuaVarZzb, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 19:
                zzbdx zzbdxVarZzb = zzbdw.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzO(zzbdxVarZzb);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    vVar = iInterfaceQueryLocalInterface3 instanceof w ? (w) iInterfaceQueryLocalInterface3 : new v(strongBinder3, "com.google.android.gms.ads.internal.client.IAdClickListener");
                }
                zzayt.zzc(parcel);
                zzC(vVar);
                parcel2.writeNoException();
                return true;
            case zzbch.zzt.zzm /* 21 */:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    e1Var = iInterfaceQueryLocalInterface4 instanceof e1 ? (e1) iInterfaceQueryLocalInterface4 : new e1(strongBinder4);
                }
                zzayt.zzc(parcel);
                zzac(e1Var);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zZzg = zzayt.zzg(parcel);
                zzayt.zzc(parcel);
                zzN(zZzg);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzZ = zzZ();
                parcel2.writeNoException();
                int i13 = zzayt.zza;
                parcel2.writeInt(zZzZ ? 1 : 0);
                return true;
            case 24:
                zzbwg zzbwgVarZzb = zzbwf.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzS(zzbwgVarZzb);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                zzayt.zzc(parcel);
                zzT(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                l2 l2VarZzl = zzl();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, l2VarZzl);
                return true;
            case 29:
                n3 n3Var = (n3) zzayt.zza(parcel, n3.CREATOR);
                zzayt.zzc(parcel);
                zzU(n3Var);
                parcel2.writeNoException();
                return true;
            case 30:
                o2 o2Var = (o2) zzayt.zza(parcel, o2.CREATOR);
                zzayt.zzc(parcel);
                zzK(o2Var);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 32:
                b1 b1VarZzj = zzj();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, b1VarZzj);
                return true;
            case 33:
                z zVarZzi = zzi();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zVarZzi);
                return true;
            case 34:
                boolean zZzg2 = zzayt.zzg(parcel);
                zzayt.zzc(parcel);
                zzL(zZzg2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    o0Var = iInterfaceQueryLocalInterface5 instanceof q0 ? (q0) iInterfaceQueryLocalInterface5 : new o0(strongBinder5);
                }
                zzayt.zzc(parcel);
                zzE(o0Var);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzd = zzd();
                parcel2.writeNoException();
                zzayt.zze(parcel2, bundleZzd);
                return true;
            case 38:
                String string3 = parcel.readString();
                zzayt.zzc(parcel);
                zzR(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                v3 v3Var = (v3) zzayt.zza(parcel, v3.CREATOR);
                zzayt.zzc(parcel);
                zzI(v3Var);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbax zzbaxVarZze = zzbaw.zze(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzH(zzbaxVarZze);
                parcel2.writeNoException();
                return true;
            case 41:
                i2 i2VarZzk = zzk();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, i2VarZzk);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    z1Var = iInterfaceQueryLocalInterface6 instanceof a2 ? (a2) iInterfaceQueryLocalInterface6 : new z1(strongBinder6);
                }
                zzayt.zzc(parcel);
                zzP(z1Var);
                parcel2.writeNoException();
                return true;
            case 43:
                q3 q3Var2 = (q3) zzayt.zza(parcel, q3.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    a0Var = iInterfaceQueryLocalInterface7 instanceof c0 ? (c0) iInterfaceQueryLocalInterface7 : new a0(strongBinder7, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
                }
                zzayt.zzc(parcel);
                zzy(q3Var2, a0Var);
                parcel2.writeNoException();
                return true;
            case 44:
                xd.a aVarN = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzW(aVarN);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    f1Var = iInterfaceQueryLocalInterface8 instanceof g1 ? (g1) iInterfaceQueryLocalInterface8 : new f1(strongBinder8, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                }
                zzayt.zzc(parcel);
                zzJ(f1Var);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zZzY = zzY();
                parcel2.writeNoException();
                int i14 = zzayt.zza;
                parcel2.writeInt(zZzY ? 1 : 0);
                return true;
        }
    }
}
