package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.List;
import p.g;
import p.l;
import p.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbed {
    private m zza;
    private g zzb;
    private l zzc;
    private zzbec zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(zzhgo.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final m zza() {
        g gVar = this.zzb;
        if (gVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = gVar.b(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String strZza;
        if (this.zzb == null && (strZza = zzhgo.zza(activity)) != null) {
            zzhgp zzhgpVar = new zzhgp(this);
            this.zzc = zzhgpVar;
            zzhgpVar.setApplicationContext(activity.getApplicationContext());
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(strZza)) {
                intent.setPackage(strZza);
            }
            activity.bindService(intent, zzhgpVar, 33);
        }
    }

    public final void zzc(g gVar) {
        this.zzb = gVar;
        gVar.getClass();
        try {
            ((b.b) gVar.f12581a).x();
        } catch (RemoteException unused) {
        }
        zzbec zzbecVar = this.zzd;
        if (zzbecVar != null) {
            zzbecVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbec zzbecVar) {
        this.zzd = zzbecVar;
    }

    public final void zzf(Activity activity) {
        l lVar = this.zzc;
        if (lVar == null) {
            return;
        }
        activity.unbindService(lVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
