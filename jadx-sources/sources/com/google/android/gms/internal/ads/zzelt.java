package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
import mc.n;
import nc.s3;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzelt implements zzett {
    public final Context zza;
    public final s3 zzb;
    public final List zzc;

    public zzelt(Context context, s3 s3Var, List list) {
        this.zza = context;
        this.zzb = s3Var;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final void zzb(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        zzcut zzcutVar = (zzcut) obj;
        if (((Boolean) zzbff.zza.zze()).booleanValue()) {
            Bundle bundle = new Bundle();
            r0 r0Var = n.D.f11577c;
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", className);
            Bundle bundle2 = new Bundle();
            s3 s3Var = this.zzb;
            bundle2.putInt("width", s3Var.f12224e);
            bundle2.putInt("height", s3Var.f12221b);
            bundle.putBundle("size", bundle2);
            List list = this.zzc;
            if (!list.isEmpty()) {
                bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            zzcutVar.zza.putBundle("view_hierarchy", bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
