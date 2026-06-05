package yc;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbew;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f20276a = (String) zzbew.zza.zze();

    public final String a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f20276a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
