package sa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final w f14947c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ w[] f14948d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ wi.b f14949e;

    /* renamed from: a, reason: collision with root package name */
    public final String f14950a;

    /* renamed from: b, reason: collision with root package name */
    public final char f14951b;

    static {
        w wVar = new w("WALLPAPER", 0, "Wallpaper", '\uec49');
        w wVar2 = new w("THEME", 1, "Theme", '\uec08');
        w wVar3 = new w("WIDGETS", 2, "Widgets", '\ueca6');
        f14947c = wVar3;
        w[] wVarArr = {wVar, wVar2, wVar3, new w("SETTINGS", 3, "Settings", '\uec04')};
        f14948d = wVarArr;
        f14949e = u0.c.j(wVarArr);
    }

    public w(String str, int i10, String str2, char c6) {
        this.f14950a = str2;
        this.f14951b = c6;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f14948d.clone();
    }
}
