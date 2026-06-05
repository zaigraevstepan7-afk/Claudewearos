package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbch;
import java.util.ArrayList;
import nc.l2;
import nc.q3;
import nc.s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbpq extends zzays implements zzbpr {
    public zzbpq() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbpu zzbpsVar;
        zzbpu zzbpsVar2;
        zzbpu zzbpsVar3;
        zzbpu zzbpsVar4;
        zzbpu zzbpsVar5;
        zzbpu zzbpsVar6;
        zzbpu zzbpsVar7;
        zzbpu zzbpsVar8;
        zzbpu zzbpsVar9 = null;
        switch (i10) {
            case 1:
                xd.a aVarN = xd.b.n(parcel.readStrongBinder());
                s3 s3Var = (s3) zzayt.zza(parcel, s3.CREATOR);
                q3 q3Var = (q3) zzayt.zza(parcel, q3.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbpsVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpsVar = iInterfaceQueryLocalInterface instanceof zzbpu ? (zzbpu) iInterfaceQueryLocalInterface : new zzbps(strongBinder);
                }
                zzayt.zzc(parcel);
                zzu(aVarN, s3Var, q3Var, string, zzbpsVar);
                parcel2.writeNoException();
                return true;
            case 2:
                xd.a aVarZzn = zzn();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, aVarZzn);
                return true;
            case 3:
                xd.a aVarN2 = xd.b.n(parcel.readStrongBinder());
                q3 q3Var2 = (q3) zzayt.zza(parcel, q3.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbpsVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpsVar2 = iInterfaceQueryLocalInterface2 instanceof zzbpu ? (zzbpu) iInterfaceQueryLocalInterface2 : new zzbps(strongBinder2);
                }
                zzayt.zzc(parcel);
                zzx(aVarN2, q3Var2, string2, zzbpsVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzI();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                xd.a aVarN3 = xd.b.n(parcel.readStrongBinder());
                s3 s3Var2 = (s3) zzayt.zza(parcel, s3.CREATOR);
                q3 q3Var3 = (q3) zzayt.zza(parcel, q3.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    zzbpsVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpsVar3 = iInterfaceQueryLocalInterface3 instanceof zzbpu ? (zzbpu) iInterfaceQueryLocalInterface3 : new zzbps(strongBinder3);
                }
                zzayt.zzc(parcel);
                zzv(aVarN3, s3Var2, q3Var3, string3, string4, zzbpsVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                xd.a aVarN4 = xd.b.n(parcel.readStrongBinder());
                q3 q3Var4 = (q3) zzayt.zza(parcel, q3.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    zzbpsVar4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpsVar4 = iInterfaceQueryLocalInterface4 instanceof zzbpu ? (zzbpu) iInterfaceQueryLocalInterface4 : new zzbps(strongBinder4);
                }
                zzayt.zzc(parcel);
                zzy(aVarN4, q3Var4, string5, string6, zzbpsVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                xd.a aVarN5 = xd.b.n(parcel.readStrongBinder());
                q3 q3Var5 = (q3) zzayt.zza(parcel, q3.CREATOR);
                String string7 = parcel.readString();
                zzbwl zzbwlVarZzb = zzbwk.zzb(parcel.readStrongBinder());
                String string8 = parcel.readString();
                zzayt.zzc(parcel);
                zzp(aVarN5, q3Var5, string7, zzbwlVarZzb, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                q3 q3Var6 = (q3) zzayt.zza(parcel, q3.CREATOR);
                String string9 = parcel.readString();
                zzayt.zzc(parcel);
                zzs(q3Var6, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzN = zzN();
                parcel2.writeNoException();
                int i12 = zzayt.zza;
                parcel2.writeInt(zZzN ? 1 : 0);
                return true;
            case 14:
                xd.a aVarN6 = xd.b.n(parcel.readStrongBinder());
                q3 q3Var7 = (q3) zzayt.zza(parcel, q3.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    zzbpsVar5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpsVar5 = iInterfaceQueryLocalInterface5 instanceof zzbpu ? (zzbpu) iInterfaceQueryLocalInterface5 : new zzbps(strongBinder5);
                }
                zzbgc zzbgcVar = (zzbgc) zzayt.zza(parcel, zzbgc.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                zzayt.zzc(parcel);
                zzz(aVarN6, q3Var7, string10, string11, zzbpsVar5, zzbgcVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzayt.zzf(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzayt.zzf(parcel2, null);
                return true;
            case 17:
                Bundle bundleZze = zze();
                parcel2.writeNoException();
                zzayt.zze(parcel2, bundleZze);
                return true;
            case 18:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                zzayt.zze(parcel2, bundleZzf);
                return true;
            case 19:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                zzayt.zze(parcel2, bundleZzg);
                return true;
            case 20:
                q3 q3Var8 = (q3) zzayt.zza(parcel, q3.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzayt.zzc(parcel);
                zzB(q3Var8, string12, string13);
                parcel2.writeNoException();
                return true;
            case zzbch.zzt.zzm /* 21 */:
                xd.a aVarN7 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzD(aVarN7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i13 = zzayt.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                xd.a aVarN8 = xd.b.n(parcel.readStrongBinder());
                zzbwl zzbwlVarZzb2 = zzbwk.zzb(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                zzayt.zzc(parcel);
                zzr(aVarN8, zzbwlVarZzb2, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbhh zzbhhVarZzi = zzi();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbhhVarZzi);
                return true;
            case 25:
                boolean zZzg = zzayt.zzg(parcel);
                zzayt.zzc(parcel);
                zzG(zZzg);
                parcel2.writeNoException();
                return true;
            case 26:
                l2 l2VarZzh = zzh();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, l2VarZzh);
                return true;
            case 27:
                zzbqd zzbqdVarZzk = zzk();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbqdVarZzk);
                return true;
            case 28:
                xd.a aVarN9 = xd.b.n(parcel.readStrongBinder());
                q3 q3Var9 = (q3) zzayt.zza(parcel, q3.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    zzbpsVar6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpsVar6 = iInterfaceQueryLocalInterface6 instanceof zzbpu ? (zzbpu) iInterfaceQueryLocalInterface6 : new zzbps(strongBinder6);
                }
                zzayt.zzc(parcel);
                zzA(aVarN9, q3Var9, string14, zzbpsVar6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                xd.a aVarN10 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzK(aVarN10);
                parcel2.writeNoException();
                return true;
            case 31:
                xd.a aVarN11 = xd.b.n(parcel.readStrongBinder());
                zzbmf zzbmfVarZzb = zzbme.zzb(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbml.CREATOR);
                zzayt.zzc(parcel);
                zzq(aVarN11, zzbmfVarZzb, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                xd.a aVarN12 = xd.b.n(parcel.readStrongBinder());
                q3 q3Var10 = (q3) zzayt.zza(parcel, q3.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 == null) {
                    zzbpsVar7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpsVar7 = iInterfaceQueryLocalInterface7 instanceof zzbpu ? (zzbpu) iInterfaceQueryLocalInterface7 : new zzbps(strongBinder7);
                }
                zzayt.zzc(parcel);
                zzC(aVarN12, q3Var10, string15, zzbpsVar7);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbsc zzbscVarZzl = zzl();
                parcel2.writeNoException();
                zzayt.zze(parcel2, zzbscVarZzl);
                return true;
            case 34:
                zzbsc zzbscVarZzm = zzm();
                parcel2.writeNoException();
                zzayt.zze(parcel2, zzbscVarZzm);
                return true;
            case 35:
                xd.a aVarN13 = xd.b.n(parcel.readStrongBinder());
                s3 s3Var3 = (s3) zzayt.zza(parcel, s3.CREATOR);
                q3 q3Var11 = (q3) zzayt.zza(parcel, q3.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    zzbpsVar8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpsVar8 = iInterfaceQueryLocalInterface8 instanceof zzbpu ? (zzbpu) iInterfaceQueryLocalInterface8 : new zzbps(strongBinder8);
                }
                zzayt.zzc(parcel);
                zzw(aVarN13, s3Var3, q3Var11, string16, string17, zzbpsVar8);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbpx zzbpxVarZzj = zzj();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbpxVarZzj);
                return true;
            case 37:
                xd.a aVarN14 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzJ(aVarN14);
                parcel2.writeNoException();
                return true;
            case 38:
                xd.a aVarN15 = xd.b.n(parcel.readStrongBinder());
                q3 q3Var12 = (q3) zzayt.zza(parcel, q3.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpsVar9 = iInterfaceQueryLocalInterface9 instanceof zzbpu ? (zzbpu) iInterfaceQueryLocalInterface9 : new zzbps(strongBinder9);
                }
                zzayt.zzc(parcel);
                zzt(aVarN15, q3Var12, string18, zzbpsVar9);
                parcel2.writeNoException();
                return true;
            case 39:
                xd.a aVarN16 = xd.b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzH(aVarN16);
                parcel2.writeNoException();
                return true;
        }
    }
}
