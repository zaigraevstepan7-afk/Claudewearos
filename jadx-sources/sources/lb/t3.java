package lb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t3 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f10675b;

    /* renamed from: c, reason: collision with root package name */
    public static final t3 f10676c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ t3[] f10677d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ wi.b f10678e;

    /* renamed from: a, reason: collision with root package name */
    public final String f10679a;

    static {
        t3 t3Var = new t3("SLIDE", 0, "Slide");
        f10676c = t3Var;
        t3[] t3VarArr = {t3Var, new t3("CROSSFADE", 1, "Crossfade"), new t3("TUMBLE", 2, "Tumble"), new t3("ROTATE", 3, "Rotate"), new t3("CUBE", 4, "Cube")};
        f10677d = t3VarArr;
        f10678e = u0.c.j(t3VarArr);
        f10675b = new a();
    }

    public t3(String str, int i10, String str2) {
        this.f10679a = str2;
    }

    public static t3 valueOf(String str) {
        return (t3) Enum.valueOf(t3.class, str);
    }

    public static t3[] values() {
        return (t3[]) f10677d.clone();
    }
}
