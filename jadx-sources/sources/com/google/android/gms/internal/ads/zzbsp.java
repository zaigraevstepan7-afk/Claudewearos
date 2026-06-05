package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.anonlab.voidlauncher.R;
import java.util.Map;
import mc.n;
import org.json.JSONException;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbsp extends zzbss {
    private final Map zza;
    private final Context zzb;

    public zzbsp(zzcfe zzcfeVar, Map map) {
        super(zzcfeVar, "storePicture");
        this.zza = map;
        this.zzb = zzcfeVar.zzi();
    }

    public final void zzb() throws JSONException {
        Context context = this.zzb;
        if (context == null) {
            zzh("Activity context is not available");
            return;
        }
        n nVar = n.D;
        r0 r0Var = nVar.f11577c;
        if (!new zzbck(context).zzc()) {
            zzh("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzh("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzh("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        r0 r0Var2 = nVar.f11577c;
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzh("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesZze = nVar.f11582h.zze();
        r0 r0Var3 = nVar.f11577c;
        AlertDialog.Builder builderJ = r0.j(context);
        builderJ.setTitle(resourcesZze != null ? resourcesZze.getString(R.string.f3405s1) : "Save image");
        builderJ.setMessage(resourcesZze != null ? resourcesZze.getString(R.string.f3406s2) : "Allow Ad to store image in Picture gallery?");
        builderJ.setPositiveButton(resourcesZze != null ? resourcesZze.getString(R.string.f3407s3) : "Accept", new zzbsn(this, str, lastPathSegment));
        builderJ.setNegativeButton(resourcesZze != null ? resourcesZze.getString(R.string.f3408s4) : "Decline", new zzbso(this));
        builderJ.create().show();
    }
}
