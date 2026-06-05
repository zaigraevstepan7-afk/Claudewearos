package lb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r3 {
    public static final r3 A;
    public static final r3 B;
    public static final r3 C;
    public static final /* synthetic */ r3[] D;
    public static final /* synthetic */ wi.b E;

    /* renamed from: b, reason: collision with root package name */
    public static final a f10627b;

    /* renamed from: c, reason: collision with root package name */
    public static final r3 f10628c;

    /* renamed from: d, reason: collision with root package name */
    public static final r3 f10629d;

    /* renamed from: e, reason: collision with root package name */
    public static final r3 f10630e;

    /* renamed from: f, reason: collision with root package name */
    public static final r3 f10631f;

    /* renamed from: z, reason: collision with root package name */
    public static final r3 f10632z;

    /* renamed from: a, reason: collision with root package name */
    public final String f10633a;

    static {
        r3 r3Var = new r3("ALL", 0, "all");
        f10628c = r3Var;
        r3 r3Var2 = new r3("APP_ICONS", 1, "app_icons");
        f10629d = r3Var2;
        r3 r3Var3 = new r3("DOCK", 2, "dock");
        f10630e = r3Var3;
        r3 r3Var4 = new r3("HIGHLIGHTS", 3, "highlights");
        f10631f = r3Var4;
        r3 r3Var5 = new r3("SOUNDS_VIBRATION", 4, "sounds_vibration");
        f10632z = r3Var5;
        r3 r3Var6 = new r3("PASSCODE", 5, "passcode");
        A = r3Var6;
        r3 r3Var7 = new r3("LOCKSCREEN", 6, "lockscreen");
        B = r3Var7;
        r3 r3Var8 = new r3("OPEN_ANIMATIONS", 7, "open_animations");
        C = r3Var8;
        r3[] r3VarArr = {r3Var, r3Var2, r3Var3, r3Var4, r3Var5, r3Var6, r3Var7, r3Var8};
        D = r3VarArr;
        E = u0.c.j(r3VarArr);
        f10627b = new a();
    }

    public r3(String str, int i10, String str2) {
        this.f10633a = str2;
    }

    public static r3 valueOf(String str) {
        return (r3) Enum.valueOf(r3.class, str);
    }

    public static r3[] values() {
        return (r3[]) D.clone();
    }
}
