package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.anonlab.voidlauncher.R;
import java.util.Map;
import mc.n;
import org.json.JSONException;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbsj extends zzbss {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbsj(zzcfe zzcfeVar, Map map) {
        super(zzcfeVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcfeVar.zzi();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze("location");
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        Map map = this.zza;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j4 = this.zze;
        if (j4 > -1) {
            data.putExtra("endTime", j4);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() throws JSONException {
        Context context = this.zzb;
        if (context == null) {
            zzh("Activity context is not available.");
            return;
        }
        n nVar = n.D;
        r0 r0Var = nVar.f11577c;
        if (!new zzbck(context).zzb()) {
            zzh("This feature is not available on the device.");
            return;
        }
        r0 r0Var2 = nVar.f11577c;
        AlertDialog.Builder builderJ = r0.j(context);
        Resources resourcesZze = nVar.f11582h.zze();
        builderJ.setTitle(resourcesZze != null ? resourcesZze.getString(R.string.f3409s5) : "Create calendar event");
        builderJ.setMessage(resourcesZze != null ? resourcesZze.getString(R.string.f3410s6) : "Allow Ad to create a calendar event?");
        builderJ.setPositiveButton(resourcesZze != null ? resourcesZze.getString(R.string.f3407s3) : "Accept", new zzbsh(this));
        builderJ.setNegativeButton(resourcesZze != null ? resourcesZze.getString(R.string.f3408s4) : "Decline", new zzbsi(this));
        builderJ.create().show();
    }
}
