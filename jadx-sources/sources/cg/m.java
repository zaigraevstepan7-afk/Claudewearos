package cg;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f3381a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3382b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3383c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3384d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3385e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3386f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3387g;

    public m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = ud.f.f16993a;
        e0.k("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f3382b = str;
        this.f3381a = str2;
        this.f3383c = str3;
        this.f3384d = str4;
        this.f3385e = str5;
        this.f3386f = str6;
        this.f3387g = str7;
    }

    public static m a(Context context) {
        mh.g gVar = new mh.g(context, 8);
        String strQ = gVar.q("google_app_id");
        if (TextUtils.isEmpty(strQ)) {
            return null;
        }
        return new m(strQ, gVar.q("google_api_key"), gVar.q("firebase_database_url"), gVar.q("ga_trackingId"), gVar.q("gcm_defaultSenderId"), gVar.q("google_storage_bucket"), gVar.q("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return e0.l(this.f3382b, mVar.f3382b) && e0.l(this.f3381a, mVar.f3381a) && e0.l(this.f3383c, mVar.f3383c) && e0.l(this.f3384d, mVar.f3384d) && e0.l(this.f3385e, mVar.f3385e) && e0.l(this.f3386f, mVar.f3386f) && e0.l(this.f3387g, mVar.f3387g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3382b, this.f3381a, this.f3383c, this.f3384d, this.f3385e, this.f3386f, this.f3387g});
    }

    public final String toString() {
        t0.j jVar = new t0.j(this);
        jVar.g(this.f3382b, "applicationId");
        jVar.g(this.f3381a, "apiKey");
        jVar.g(this.f3383c, "databaseUrl");
        jVar.g(this.f3385e, "gcmSenderId");
        jVar.g(this.f3386f, "storageBucket");
        jVar.g(this.f3387g, "projectId");
        return jVar.toString();
    }
}
