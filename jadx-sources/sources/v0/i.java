package v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f17401a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f17402b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f17403c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i[] f17404d;

    static {
        i iVar = new i("CROSSED", 0);
        f17401a = iVar;
        i iVar2 = new i("NOT_CROSSED", 1);
        f17402b = iVar2;
        i iVar3 = new i("COLLAPSED", 2);
        f17403c = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        f17404d = iVarArr;
        u0.c.j(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f17404d.clone();
    }
}
