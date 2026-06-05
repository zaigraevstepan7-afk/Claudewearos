package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import mc.n;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;
import qc.m0;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdul {
    private final Context zza;
    private final ApplicationInfo zzb;
    private final int zzc;
    private final int zzd;
    private String zze = "";

    public zzdul(Context context) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
        zzbct zzbctVar = zzbdc.zzjt;
        t tVar = t.f12227d;
        this.zzc = ((Integer) tVar.f12230c.zzb(zzbctVar)).intValue();
        this.zzd = ((Integer) tVar.f12230c.zzb(zzbdc.zzju)).intValue();
    }

    public final JSONObject zza() throws JSONException, PackageManager.NameNotFoundException {
        String strG;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.zza;
            String str = this.zzb.packageName;
            m0 m0Var = r0.f13445l;
            jSONObject.put("name", wd.b.a(context).c(str));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.zzb.packageName);
        r0 r0Var = n.D.f11577c;
        Drawable applicationIcon = null;
        try {
            strG = r0.G(this.zza);
        } catch (RemoteException unused2) {
            strG = null;
        }
        jSONObject.put("adMobAppId", strG);
        if (this.zze.isEmpty()) {
            try {
                k3.a aVarA = wd.b.a(this.zza);
                String str2 = this.zzb.packageName;
                Context context2 = aVarA.f9352a;
                ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(str2, 0);
                context2.getPackageManager().getApplicationLabel(applicationInfo);
                applicationIcon = context2.getPackageManager().getApplicationIcon(applicationInfo);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (applicationIcon == null) {
                strEncodeToString = "";
            } else {
                int i10 = this.zzc;
                int i11 = this.zzd;
                applicationIcon.setBounds(0, 0, i10, i11);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                applicationIcon.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.zze = strEncodeToString;
        }
        if (!this.zze.isEmpty()) {
            jSONObject.put("icon", this.zze);
            jSONObject.put("iconWidthPx", this.zzc);
            jSONObject.put("iconHeightPx", this.zzd);
        }
        return jSONObject;
    }
}
