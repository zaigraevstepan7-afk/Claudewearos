package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbch;
import nc.l2;
import nc.q3;
import nc.s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbrm extends zzays implements zzbrn {
    public zzbrm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbrn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbrn ? (zzbrn) iInterfaceQueryLocalInterface : new zzbrl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbrq zzbroVar = null;
        zzbqy zzbqwVar = null;
        zzbrh zzbrfVar = null;
        zzbrb zzbqzVar = null;
        zzbrk zzbriVar = null;
        zzbrh zzbrfVar2 = null;
        zzbrk zzbriVar2 = null;
        zzbre zzbrcVar = null;
        zzbrb zzbqzVar2 = null;
        if (i10 == 1) {
            xd.a aVarN = xd.b.n(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzayt.zza(parcel, creator);
            Bundle bundle2 = (Bundle) zzayt.zza(parcel, creator);
            s3 s3Var = (s3) zzayt.zza(parcel, s3.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbroVar = iInterfaceQueryLocalInterface instanceof zzbrq ? (zzbrq) iInterfaceQueryLocalInterface : new zzbro(strongBinder);
            }
            zzayt.zzc(parcel);
            zzh(aVarN, string, bundle, bundle2, s3Var, zzbroVar);
            parcel2.writeNoException();
        } else if (i10 == 2) {
            zzbsc zzbscVarZzf = zzf();
            parcel2.writeNoException();
            zzayt.zze(parcel2, zzbscVarZzf);
        } else if (i10 == 3) {
            zzbsc zzbscVarZzg = zzg();
            parcel2.writeNoException();
            zzayt.zze(parcel2, zzbscVarZzg);
        } else if (i10 == 5) {
            l2 l2VarZze = zze();
            parcel2.writeNoException();
            zzayt.zzf(parcel2, l2VarZze);
        } else if (i10 == 10) {
            xd.b.n(parcel.readStrongBinder());
            zzayt.zzc(parcel);
            parcel2.writeNoException();
        } else if (i10 != 11) {
            switch (i10) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    q3 q3Var = (q3) zzayt.zza(parcel, q3.CREATOR);
                    xd.a aVarN2 = xd.b.n(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqzVar2 = iInterfaceQueryLocalInterface2 instanceof zzbrb ? (zzbrb) iInterfaceQueryLocalInterface2 : new zzbqz(strongBinder2);
                    }
                    zzbrb zzbrbVar = zzbqzVar2;
                    zzbpu zzbpuVarZzb = zzbpt.zzb(parcel.readStrongBinder());
                    s3 s3Var2 = (s3) zzayt.zza(parcel, s3.CREATOR);
                    zzayt.zzc(parcel);
                    zzj(string2, string3, q3Var, aVarN2, zzbrbVar, zzbpuVarZzb, s3Var2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    q3 q3Var2 = (q3) zzayt.zza(parcel, q3.CREATOR);
                    xd.a aVarN3 = xd.b.n(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbrcVar = iInterfaceQueryLocalInterface3 instanceof zzbre ? (zzbre) iInterfaceQueryLocalInterface3 : new zzbrc(strongBinder3);
                    }
                    zzbpu zzbpuVarZzb2 = zzbpt.zzb(parcel.readStrongBinder());
                    zzayt.zzc(parcel);
                    zzl(string4, string5, q3Var2, aVarN3, zzbrcVar, zzbpuVarZzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    xd.a aVarN4 = xd.b.n(parcel.readStrongBinder());
                    zzayt.zzc(parcel);
                    boolean zZzs = zzs(aVarN4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzs ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    q3 q3Var3 = (q3) zzayt.zza(parcel, q3.CREATOR);
                    xd.a aVarN5 = xd.b.n(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbriVar2 = iInterfaceQueryLocalInterface4 instanceof zzbrk ? (zzbrk) iInterfaceQueryLocalInterface4 : new zzbri(strongBinder4);
                    }
                    zzbpu zzbpuVarZzb3 = zzbpt.zzb(parcel.readStrongBinder());
                    zzayt.zzc(parcel);
                    zzp(string6, string7, q3Var3, aVarN5, zzbriVar2, zzbpuVarZzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    xd.a aVarN6 = xd.b.n(parcel.readStrongBinder());
                    zzayt.zzc(parcel);
                    boolean zZzt = zzt(aVarN6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzt ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    q3 q3Var4 = (q3) zzayt.zza(parcel, q3.CREATOR);
                    xd.a aVarN7 = xd.b.n(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbrfVar2 = iInterfaceQueryLocalInterface5 instanceof zzbrh ? (zzbrh) iInterfaceQueryLocalInterface5 : new zzbrf(strongBinder5);
                    }
                    zzbpu zzbpuVarZzb4 = zzbpt.zzb(parcel.readStrongBinder());
                    zzayt.zzc(parcel);
                    zzm(string8, string9, q3Var4, aVarN7, zzbrfVar2, zzbpuVarZzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    zzayt.zzc(parcel);
                    zzq(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    q3 q3Var5 = (q3) zzayt.zza(parcel, q3.CREATOR);
                    xd.a aVarN8 = xd.b.n(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbriVar = iInterfaceQueryLocalInterface6 instanceof zzbrk ? (zzbrk) iInterfaceQueryLocalInterface6 : new zzbri(strongBinder6);
                    }
                    zzbpu zzbpuVarZzb5 = zzbpt.zzb(parcel.readStrongBinder());
                    zzayt.zzc(parcel);
                    zzo(string11, string12, q3Var5, aVarN8, zzbriVar, zzbpuVarZzb5);
                    parcel2.writeNoException();
                    break;
                case zzbch.zzt.zzm /* 21 */:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    q3 q3Var6 = (q3) zzayt.zza(parcel, q3.CREATOR);
                    xd.a aVarN9 = xd.b.n(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqzVar = iInterfaceQueryLocalInterface7 instanceof zzbrb ? (zzbrb) iInterfaceQueryLocalInterface7 : new zzbqz(strongBinder7);
                    }
                    zzbrb zzbrbVar2 = zzbqzVar;
                    zzbpu zzbpuVarZzb6 = zzbpt.zzb(parcel.readStrongBinder());
                    s3 s3Var3 = (s3) zzayt.zza(parcel, s3.CREATOR);
                    zzayt.zzc(parcel);
                    zzk(string13, string14, q3Var6, aVarN9, zzbrbVar2, zzbpuVarZzb6, s3Var3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    q3 q3Var7 = (q3) zzayt.zza(parcel, q3.CREATOR);
                    xd.a aVarN10 = xd.b.n(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbrfVar = iInterfaceQueryLocalInterface8 instanceof zzbrh ? (zzbrh) iInterfaceQueryLocalInterface8 : new zzbrf(strongBinder8);
                    }
                    zzbpu zzbpuVarZzb7 = zzbpt.zzb(parcel.readStrongBinder());
                    zzbgc zzbgcVar = (zzbgc) zzayt.zza(parcel, zzbgc.CREATOR);
                    zzayt.zzc(parcel);
                    zzn(string15, string16, q3Var7, aVarN10, zzbrfVar, zzbpuVarZzb7, zzbgcVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    q3 q3Var8 = (q3) zzayt.zza(parcel, q3.CREATOR);
                    xd.a aVarN11 = xd.b.n(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbqwVar = iInterfaceQueryLocalInterface9 instanceof zzbqy ? (zzbqy) iInterfaceQueryLocalInterface9 : new zzbqw(strongBinder9);
                    }
                    zzbpu zzbpuVarZzb8 = zzbpt.zzb(parcel.readStrongBinder());
                    zzayt.zzc(parcel);
                    zzi(string17, string18, q3Var8, aVarN11, zzbqwVar, zzbpuVarZzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    xd.a aVarN12 = xd.b.n(parcel.readStrongBinder());
                    zzayt.zzc(parcel);
                    boolean zZzr = zzr(aVarN12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzr ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzayt.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
