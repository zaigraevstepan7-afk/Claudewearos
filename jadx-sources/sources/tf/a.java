package tf;

import android.content.Context;
import android.preference.PreferenceManager;
import nc.p;
import nf.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f16324b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final f f16325a;

    public a(p pVar) {
        Context context = (Context) pVar.f12161a;
        String str = (String) pVar.f12162b;
        String str2 = (String) pVar.f12163c;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.f16325a = (f) pVar.f12167z;
    }
}
