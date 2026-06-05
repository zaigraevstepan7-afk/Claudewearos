package ja;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import qi.t;
import tj.h0;
import tj.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8777a;

    /* renamed from: b, reason: collision with root package name */
    public final l9.a f8778b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f8779c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final h0 f8780d = i0.a(1, 5, null);

    /* renamed from: e, reason: collision with root package name */
    public final SharedPreferences f8781e;

    /* renamed from: f, reason: collision with root package name */
    public String f8782f;

    /* renamed from: g, reason: collision with root package name */
    public Map f8783g;

    public h(Context context, l9.a aVar, ka.a aVar2) {
        this.f8777a = context;
        this.f8778b = aVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("home_launcher_settings", 0);
        fj.l.e(sharedPreferences, "getSharedPreferences(...)");
        this.f8781e = sharedPreferences;
        this.f8783g = t.f13521a;
        sharedPreferences.registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ja.a
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                if (qi.l.w0(cg.b.M("icon_opacity", "icon_bg_opacity", "icon_fg_opacity", "icon_opacity_customize_expanded"), str)) {
                    h hVar = this.f8755a;
                    hVar.b();
                    hVar.f8780d.q(pi.o.f13011a);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v7, types: [pi.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap a(ja.h r14, u9.a r15) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.h.a(ja.h, u9.a):android.graphics.Bitmap");
    }

    public final void b() {
        this.f8779c.clear();
        this.f8782f = null;
        this.f8783g = t.f13521a;
    }
}
