package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbgr;
import com.google.android.gms.internal.ads.zzblb;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzbwt;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzdjg;
import com.google.android.gms.internal.ads.zzdji;
import com.google.android.gms.internal.ads.zzdtm;
import com.google.android.gms.internal.ads.zzejt;
import com.google.android.gms.internal.ads.zzewt;
import com.google.android.gms.internal.ads.zzeyh;
import com.google.android.gms.internal.ads.zzezy;
import com.google.android.gms.internal.ads.zzfbm;
import com.google.android.gms.internal.ads.zzfbq;
import java.util.HashMap;
import mc.m;
import nc.d1;
import nc.d2;
import nc.i0;
import nc.m0;
import nc.m1;
import nc.s3;
import nc.x0;
import pc.d;
import xd.a;
import xd.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class ClientApi extends zzays implements d1 {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // nc.d1
    public final m1 a(a aVar, int i10) {
        return zzcgz.zza((Context) b.u(aVar), null, i10).zzb();
    }

    @Override // nc.d1
    public final zzbth b(a aVar, zzbpo zzbpoVar, int i10) {
        return zzcgz.zza((Context) b.u(aVar), zzbpoVar, i10).zzm();
    }

    @Override // nc.d1
    public final m0 d(a aVar, s3 s3Var, String str, zzbpo zzbpoVar, int i10) {
        Context context = (Context) b.u(aVar);
        zzeyh zzeyhVarZzt = zzcgz.zza(context, zzbpoVar, i10).zzt();
        zzeyhVarZzt.zzc(context);
        zzeyhVarZzt.zza(s3Var);
        zzeyhVarZzt.zzb(str);
        return zzeyhVarZzt.zzd().zza();
    }

    @Override // nc.d1
    public final zzblf e(a aVar, zzbpo zzbpoVar, int i10, zzblc zzblcVar) {
        Context context = (Context) b.u(aVar);
        zzdtm zzdtmVarZzj = zzcgz.zza(context, zzbpoVar, i10).zzj();
        zzdtmVarZzj.zzb(context);
        zzdtmVarZzj.zza(zzblcVar);
        return zzdtmVarZzj.zzc().zzd();
    }

    @Override // nc.d1
    public final i0 f(a aVar, String str, zzbpo zzbpoVar, int i10) {
        Context context = (Context) b.u(aVar);
        return new zzejt(zzcgz.zza(context, zzbpoVar, i10), context, str);
    }

    @Override // nc.d1
    public final m0 g(a aVar, s3 s3Var, String str, zzbpo zzbpoVar, int i10) {
        Context context = (Context) b.u(aVar);
        zzewt zzewtVarZzs = zzcgz.zza(context, zzbpoVar, i10).zzs();
        zzewtVarZzs.zza(str);
        zzewtVarZzs.zzb(context);
        return zzewtVarZzs.zzc().zza();
    }

    @Override // nc.d1
    public final d2 k(a aVar, zzbpo zzbpoVar, int i10) {
        return zzcgz.zza((Context) b.u(aVar), zzbpoVar, i10).zzl();
    }

    @Override // nc.d1
    public final m0 l(a aVar, s3 s3Var, String str, zzbpo zzbpoVar, int i10) {
        Context context = (Context) b.u(aVar);
        zzezy zzezyVarZzu = zzcgz.zza(context, zzbpoVar, i10).zzu();
        zzezyVarZzu.zzc(context);
        zzezyVarZzu.zza(s3Var);
        zzezyVarZzu.zzb(str);
        return zzezyVarZzu.zzd().zza();
    }

    @Override // nc.d1
    public final zzbyy m(a aVar, zzbpo zzbpoVar, int i10) {
        return zzcgz.zza((Context) b.u(aVar), zzbpoVar, i10).zzp();
    }

    @Override // nc.d1
    public final m0 p(a aVar, s3 s3Var, String str, int i10) {
        return new m((Context) b.u(aVar), s3Var, str, new rc.a(ModuleDescriptor.MODULE_VERSION, i10, 0, true, false));
    }

    @Override // nc.d1
    public final x0 q(a aVar, zzbpo zzbpoVar, int i10) {
        return zzcgz.zza((Context) b.u(aVar), zzbpoVar, i10).zzz();
    }

    @Override // nc.d1
    public final zzbwt s(a aVar, String str, zzbpo zzbpoVar, int i10) {
        Context context = (Context) b.u(aVar);
        zzfbm zzfbmVarZzv = zzcgz.zza(context, zzbpoVar, i10).zzv();
        zzfbmVarZzv.zzb(context);
        zzfbmVarZzv.zza(str);
        return zzfbmVarZzv.zzc().zza();
    }

    @Override // nc.d1
    public final zzbgr t(a aVar, a aVar2) {
        return new zzdji((FrameLayout) b.u(aVar), (FrameLayout) b.u(aVar2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                a aVarN = b.n(parcel.readStrongBinder());
                s3 s3Var = (s3) zzayt.zza(parcel, s3.CREATOR);
                String string = parcel.readString();
                zzbpo zzbpoVarZzf = zzbpn.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzayt.zzc(parcel);
                m0 m0VarD = d(aVarN, s3Var, string, zzbpoVarZzf, i12);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, m0VarD);
                return true;
            case 2:
                a aVarN2 = b.n(parcel.readStrongBinder());
                s3 s3Var2 = (s3) zzayt.zza(parcel, s3.CREATOR);
                String string2 = parcel.readString();
                zzbpo zzbpoVarZzf2 = zzbpn.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzayt.zzc(parcel);
                m0 m0VarL = l(aVarN2, s3Var2, string2, zzbpoVarZzf2, i13);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, m0VarL);
                return true;
            case 3:
                a aVarN3 = b.n(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbpo zzbpoVarZzf3 = zzbpn.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzayt.zzc(parcel);
                i0 i0VarF = f(aVarN3, string3, zzbpoVarZzf3, i14);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, i0VarF);
                return true;
            case 4:
                b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, null);
                return true;
            case 5:
                a aVarN4 = b.n(parcel.readStrongBinder());
                a aVarN5 = b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzbgr zzbgrVarT = t(aVarN4, aVarN5);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbgrVarT);
                return true;
            case 6:
                a aVarN6 = b.n(parcel.readStrongBinder());
                zzbpo zzbpoVarZzf4 = zzbpn.zzf(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                zzayt.zzc(parcel);
                Context context = (Context) b.u(aVarN6);
                zzfbm zzfbmVarZzv = zzcgz.zza(context, zzbpoVarZzf4, i15).zzv();
                zzfbmVarZzv.zzb(context);
                zzfbq zzfbqVarZzb = zzfbmVarZzv.zzc().zzb();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzfbqVarZzb);
                return true;
            case 7:
                b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, null);
                return true;
            case 8:
                a aVarN7 = b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzbto zzbtoVarZzn = zzn(aVarN7);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbtoVarZzn);
                return true;
            case 9:
                a aVarN8 = b.n(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                zzayt.zzc(parcel);
                m1 m1VarA = a(aVarN8, i16);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, m1VarA);
                return true;
            case 10:
                a aVarN9 = b.n(parcel.readStrongBinder());
                s3 s3Var3 = (s3) zzayt.zza(parcel, s3.CREATOR);
                String string4 = parcel.readString();
                int i17 = parcel.readInt();
                zzayt.zzc(parcel);
                m0 m0VarP = p(aVarN9, s3Var3, string4, i17);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, m0VarP);
                return true;
            case 11:
                a aVarN10 = b.n(parcel.readStrongBinder());
                a aVarN11 = b.n(parcel.readStrongBinder());
                a aVarN12 = b.n(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzdjg zzdjgVar = new zzdjg((View) b.u(aVarN10), (HashMap) b.u(aVarN11), (HashMap) b.u(aVarN12));
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzdjgVar);
                return true;
            case 12:
                a aVarN13 = b.n(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbpo zzbpoVarZzf5 = zzbpn.zzf(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                zzayt.zzc(parcel);
                zzbwt zzbwtVarS = s(aVarN13, string5, zzbpoVarZzf5, i18);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbwtVarS);
                return true;
            case 13:
                a aVarN14 = b.n(parcel.readStrongBinder());
                s3 s3Var4 = (s3) zzayt.zza(parcel, s3.CREATOR);
                String string6 = parcel.readString();
                zzbpo zzbpoVarZzf6 = zzbpn.zzf(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                zzayt.zzc(parcel);
                m0 m0VarG = g(aVarN14, s3Var4, string6, zzbpoVarZzf6, i19);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, m0VarG);
                return true;
            case 14:
                a aVarN15 = b.n(parcel.readStrongBinder());
                zzbpo zzbpoVarZzf7 = zzbpn.zzf(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                zzayt.zzc(parcel);
                zzbyy zzbyyVarM = m(aVarN15, zzbpoVarZzf7, i20);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbyyVarM);
                return true;
            case 15:
                a aVarN16 = b.n(parcel.readStrongBinder());
                zzbpo zzbpoVarZzf8 = zzbpn.zzf(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                zzayt.zzc(parcel);
                zzbth zzbthVarB = b(aVarN16, zzbpoVarZzf8, i21);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbthVarB);
                return true;
            case 16:
                a aVarN17 = b.n(parcel.readStrongBinder());
                zzbpo zzbpoVarZzf9 = zzbpn.zzf(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                zzblc zzblcVarZzc = zzblb.zzc(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzblf zzblfVarE = e(aVarN17, zzbpoVarZzf9, i22, zzblcVarZzc);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzblfVarE);
                return true;
            case 17:
                a aVarN18 = b.n(parcel.readStrongBinder());
                zzbpo zzbpoVarZzf10 = zzbpn.zzf(parcel.readStrongBinder());
                int i23 = parcel.readInt();
                zzayt.zzc(parcel);
                d2 d2VarK = k(aVarN18, zzbpoVarZzf10, i23);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, d2VarK);
                return true;
            case 18:
                a aVarN19 = b.n(parcel.readStrongBinder());
                zzbpo zzbpoVarZzf11 = zzbpn.zzf(parcel.readStrongBinder());
                int i24 = parcel.readInt();
                zzayt.zzc(parcel);
                x0 x0VarQ = q(aVarN19, zzbpoVarZzf11, i24);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, x0VarQ);
                return true;
            default:
                return false;
        }
    }

    @Override // nc.d1
    public final zzbto zzn(a aVar) {
        Activity activity = (Activity) b.u(aVar);
        AdOverlayInfoParcel adOverlayInfoParcelB = AdOverlayInfoParcel.b(activity.getIntent());
        if (adOverlayInfoParcelB == null) {
            return new d(activity, 4);
        }
        int i10 = adOverlayInfoParcelB.D;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? new d(activity, 4) : new d(activity, 0) : new pc.b(activity, adOverlayInfoParcelB) : new d(activity, 2) : new d(activity, 1) : new d(activity, 3);
    }
}
