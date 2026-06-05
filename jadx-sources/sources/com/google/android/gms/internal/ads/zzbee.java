package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import mc.n;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbee extends p.a {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) t.f12227d.f12230c.zzb(zzbdc.zzkf)).split(","));
    private final zzbeh zzc;
    private final p.a zzd;
    private final zzdsh zze;

    public zzbee(zzbeh zzbehVar, p.a aVar, zzdsh zzdshVar) {
        this.zzd = aVar;
        this.zzc = zzbehVar;
        this.zze = zzdshVar;
    }

    private final void zzb(String str) {
        u3.c.x(this.zze, "pact_action", new Pair("pe", str));
    }

    @Override // p.a
    public final void extraCallback(String str, Bundle bundle) {
        p.a aVar = this.zzd;
        if (aVar != null) {
            aVar.extraCallback(str, bundle);
        }
    }

    @Override // p.a
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        p.a aVar = this.zzd;
        if (aVar != null) {
            return aVar.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // p.a
    public final void onActivityResized(int i10, int i11, Bundle bundle) {
        p.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onActivityResized(i10, i11, bundle);
        }
    }

    @Override // p.a
    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        p.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onMessageChannelReady(bundle);
        }
    }

    @Override // p.a
    public final void onNavigationEvent(int i10, Bundle bundle) {
        this.zza.set(false);
        p.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onNavigationEvent(i10, bundle);
        }
        zzbeh zzbehVar = this.zzc;
        n.D.f11584k.getClass();
        zzbehVar.zzi(System.currentTimeMillis());
        List list = this.zzb;
        if (list == null || !list.contains(String.valueOf(i10))) {
            return;
        }
        zzbehVar.zzf();
        zzb("pact_reqpmc");
    }

    @Override // p.a
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzh(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e10) {
            l0.l("Message is not in JSON format: ", e10);
        }
        p.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onPostMessage(str, bundle);
        }
    }

    @Override // p.a
    public final void onRelationshipValidationResult(int i10, Uri uri, boolean z2, Bundle bundle) {
        p.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onRelationshipValidationResult(i10, uri, z2, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
