
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.*;
import java.util.*;
public class test
{
	public static void main(String[] args)
	{
		String fileName = "E://Agreement1.jasper";
		String outFileName = "E://test.pdf";
		HashMap hm = new HashMap();
		try
		{
			JasperPrint print = JasperFillManager.fillReport(
				fileName,
				hm,
				new JREmptyDataSource());
			JRExporter exporter = 
				new net.sf.jasperreports.engine.export.JRPdfExporter();
			exporter.setParameter(
					JRExporterParameter.OUTPUT_FILE_NAME,
					outFileName);
				exporter.setParameter(
				JRExporterParameter.JASPER_PRINT,print);
				exporter.exportReport();
				System.out.println("Created file: " + outFileName);
			}
			catch (JRException e)
			{
				e.printStackTrace();
				System.exit(1);
			}
			catch (Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
	}			