package ag;

import android.os.Looper;
import android.view.Choreographer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import w2.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f424a;

    public /* synthetic */ a(int i10) {
        this.f424a = i10;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f424a) {
            case 0:
                try {
                    return (Cipher) k.f450b.f452a.q("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 1:
                try {
                    return (Cipher) k.f450b.f452a.q("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case 2:
                try {
                    return (Cipher) k.f450b.f452a.q("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e12) {
                    throw new IllegalStateException(e12);
                }
            case 3:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 4:
                CharsetDecoder charsetDecoderNewDecoder = Charset.forName("UTF8").newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                charsetDecoderNewDecoder.onMalformedInput(codingErrorAction);
                charsetDecoderNewDecoder.onUnmappableCharacter(codingErrorAction);
                return charsetDecoderNewDecoder;
            case 5:
                CharsetEncoder charsetEncoderNewEncoder = Charset.forName("UTF8").newEncoder();
                CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
                charsetEncoderNewEncoder.onMalformedInput(codingErrorAction2);
                charsetEncoderNewEncoder.onUnmappableCharacter(codingErrorAction2);
                return charsetEncoderNewEncoder;
            case 6:
                return Boolean.FALSE;
            case 7:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(bk.d.f1792h);
                return simpleDateFormat;
            case 8:
                return new Random();
            case 9:
                try {
                    return (Cipher) k.f450b.f452a.q("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e13) {
                    throw new IllegalStateException(e13);
                }
            case 10:
                try {
                    return (Cipher) k.f450b.f452a.q("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e14) {
                    throw new IllegalStateException(e14);
                }
            case 11:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                l0 l0Var = new l0(choreographer, wd.a.u(looperMyLooper));
                return yd.f.W(l0Var, l0Var.E);
            default:
                return 0L;
        }
    }
}
