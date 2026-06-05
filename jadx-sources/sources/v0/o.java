package v0;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends vi.i implements ej.e {
    public final /* synthetic */ long A;
    public final /* synthetic */ p B;

    /* renamed from: a, reason: collision with root package name */
    public yj.c f17440a;

    /* renamed from: b, reason: collision with root package name */
    public p f17441b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f17442c;

    /* renamed from: d, reason: collision with root package name */
    public long f17443d;

    /* renamed from: e, reason: collision with root package name */
    public int f17444e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f17445f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ CharSequence f17446z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j, CharSequence charSequence, ti.c cVar, p pVar) {
        super(2, cVar);
        this.f17446z = charSequence;
        this.A = j;
        this.B = pVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        o oVar = new o(this.A, this.f17446z, cVar, this.B);
        oVar.f17445f = obj;
        return oVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((TextClassifier) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        long j;
        yj.c cVar;
        CharSequence charSequence;
        TextSelection textSelection;
        p pVar;
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f17444e;
        if (i10 == 0) {
            uk.c.R(obj);
            TextClassifier textClassifier = (TextClassifier) this.f17445f;
            u4.b.x();
            long j4 = this.A;
            int iF = g3.m0.f(j4);
            int iE = g3.m0.e(j4);
            CharSequence charSequence2 = this.f17446z;
            TextSelection.Request.Builder builderK = u4.b.k(charSequence2, iF, iE);
            p pVar2 = this.B;
            TextSelection.Request.Builder defaultLocales = builderK.setDefaultLocales(pVar2.b());
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jB = g3.e0.b(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i11 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.f17443d = jB;
                this.f17444e = 2;
                if (p.a(this.B, this.f17446z, jB, textClassifier, this) != aVar) {
                    j = jB;
                }
            } else {
                yj.c cVar2 = pVar2.f17454e;
                this.f17445f = textSelectionSuggestSelection;
                this.f17440a = cVar2;
                this.f17441b = pVar2;
                this.f17442c = charSequence2;
                this.f17443d = jB;
                this.f17444e = 1;
                if (cVar2.b(this) != aVar) {
                    cVar = cVar2;
                    charSequence = charSequence2;
                    textSelection = textSelectionSuggestSelection;
                    pVar = pVar2;
                    j = jB;
                    TextClassification textClassification = textSelection.getTextClassification();
                    fj.l.c(textClassification);
                    pVar.f17456g.setValue(new k0(charSequence, j, textClassification));
                }
            }
            return aVar;
        }
        if (i10 == 1) {
            j = this.f17443d;
            charSequence = this.f17442c;
            pVar = this.f17441b;
            cVar = this.f17440a;
            textSelection = (TextSelection) this.f17445f;
            uk.c.R(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                fj.l.c(textClassification2);
                pVar.f17456g.setValue(new k0(charSequence, j, textClassification2));
            } finally {
                cVar.e(null);
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f17443d;
            uk.c.R(obj);
        }
        return new g3.m0(j);
    }
}
